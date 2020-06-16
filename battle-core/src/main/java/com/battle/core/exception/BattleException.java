package com.battle.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述：
 *
 * @ClassName BattleException
 * @Author jiangwy
 * @Date 2020/6/6 18:45
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BattleException extends RuntimeException {
    private static final long serialVersionUID = -4407031441676167009L;

    private Integer code;
    private String message;
}
