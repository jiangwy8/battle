package com.battle.core.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.battle.core.common.vo.AResultSet;
import com.battle.core.dao.TestDao;
import com.battle.core.pojo.bean.SysUser;
import com.battle.core.service.ISysUserService;
import com.battle.core.util.AResultSetUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

/**
 * 描述：
 *
 * @ClassName SysUserController
 * @Author jiangwy
 * @Date 2020/6/6 15:19
 **/
@Api(tags="系统用户")
@RestController
@RequestMapping("/sysUser")
@Slf4j
public class SysUserController extends BaseController<SysUser,ISysUserService> {
    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private TestDao testDao;

    @ApiOperation(value = "获取类型信息(id)", notes = "根据类型id获取匹配的类型信息", position = 1)
    @ApiImplicitParam(name = "id", value = "类型id", defaultValue = "", required = true, paramType = "path")
    @GetMapping(value = "/get/{id}")
    public AResultSet<SysUser> get(@PathVariable(value = "id") java.math.BigInteger id) {
        return AResultSetUtil.success(sysUserService.getById(id));
    }

    /**
     * 查询类型列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "获取类型详细信息", notes = "获取类型详细信息")
    @PostMapping(value = "/search")
    public AResultSet<APage<List<BasetypeListVO>>> search(
            @RequestBody ASearch<BasetypeSearchVO> basetype) {

        Page<BasetypeListVO> page = basetypeService.getBasetype(basetype.getSearch(), basetype.getPageNo(),
                basetype.getPageSize(), basetype.getSort());

        return ResponseEntity.ok(AResultSetUtil.success(page, page.getTotal(), page.getPageNum(), page.getPageSize()));
    }

    /**
     * 根据bigBaseType获取类型信息
     *
     * @param
     * @return
     */
    @ApiOperation(value = "根据bigBaseType获取类型信息", notes = "根据bigBaseType获取类型信息")
    @PostMapping(value = "basetype/getListByBigBasetype")
    public ResponseEntity<AResultSet<List<BasetypeWriteVO>>> getListByBigBasetype(String bigBaseType) {
        return ResponseEntity.ok(AResultSetUtil.success(basetypeService.getListByBigBasetype(bigBaseType)));
    }

    /**
     * 添加类型
     *
     * @param
     * @return
     */
    @ApiOperation(value = "创建类型", notes = "创建类型信息")
    @PostMapping(value = "basetype/add")
    @Transactional
    public ResponseEntity<AResultSet> add(@Valid @RequestBody BasetypeWriteVO basetype) {
        return ResponseEntity.ok(AResultSetUtil.success(basetypeService.insertBasetype(basetype)));
    }

    /**
     * 删除类型
     *
     * @param
     * @return
     */
    @ApiOperation(value = "删除类型", notes = "根据类型id来指定删除类型")
    @PostMapping(value = "basetype/delete")
    @Transactional
    public ResponseEntity<AResultSet> delete(@RequestBody(required = true) String[] id) {
        return ResponseEntity.ok(AResultSetUtil.success(basetypeService.deleteBasetype(id)));
    }

    /**
     * 修改类型信息
     *
     * @param
     * @return
     */
    @ApiOperation(value = "更新类型信息", notes = "修改类型信息")
    @PostMapping(value = "basetype/edit")
    @Transactional
    public ResponseEntity<AResultSet> update(@RequestBody(required = true) BasetypeWriteVO basetype) {
        return ResponseEntity.ok(AResultSetUtil.success(basetypeService.updateBasetype(basetype)));
    }

    /**
     * 上传类型列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "上传类型信息", notes = "上传类型信息")
    @PostMapping(value = "basetype/import", consumes = "multipart/*", headers = "content-type=multipart/form-data")
    @Transactional
    public ResponseEntity<AResultSet> importExcel(@ApiParam(value = "上传Excel", required = true) MultipartFile file) {
        List<BasetypeWriteVO> list = ExcelUtil.importExcel(file, 0, 1, BasetypeWriteVO.class);
        return ResponseEntity.ok(AResultSetUtil.success(basetypeService.insertBasetype(list)));
    }

    /**
     * 导出类型列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "下载类型详细信息", notes = "获取类型详细信息")
    @PostMapping(value = "basetype/export")
    public void exportExcel(@RequestBody BasetypeSearchVO basetype, HttpServletRequest request,
                            HttpServletResponse response) {

        try {
            ExcelUtil.exportExcel(response, BasetypeListVO.class, "类型_" + DateUtil.getStringToday(),
                    basetypeService.getBasetype(basetype, 0, 0, ""));
        } catch (Exception e) {
            throw new NadaException(100, e.getMessage());
        }
    }

    /**
     * 下载类型模板
     *
     * @param
     * @return
     */ 
    @ApiOperation(value = "下载类型模板", notes = "下载类型模板")
    @PostMapping(value = "basetype/template")
    public void template(HttpServletRequest request, HttpServletResponse response) {

        try {
            ExcelUtil.exportExcel(response, BasetypeWriteVO.class, "类型模板_" + DateUtil.getStringToday(),
                    new LinkedList());
        } catch (Exception e) {
            throw new NadaException(100, e.getMessage());
        }
    }
}
