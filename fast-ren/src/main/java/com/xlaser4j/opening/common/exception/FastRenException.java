package com.xlaser4j.opening.common.exception;

import com.xlaser4j.opening.common.enums.Status;
import lombok.Getter;

/**
 * The type Fast ren exception.
 *
 * @package: com.xlaser4j.opening.common.exception
 * @author: Elijah.D
 * @time: 2018/10/15 16:43
 * @description: 统一处理异常
 * @modified: Elijah.D
 */
@Getter
public class FastRenException extends BaseException {
    private static final long serialVersionUID = 2972087296820246773L;

    /**
     * Instantiates a new Fast ren exception.
     *
     * @param status the status
     */
    public FastRenException(Status status) {
        super(status);
    }

    /**
     * Instantiates a new Fast ren exception.
     *
     * @param status the status
     * @param data   the data
     */
    public FastRenException(Status status, Object data) {
        super(status, data);
    }

    /**
     * Instantiates a new Fast ren exception.
     *
     * @param code    the code
     * @param message the message
     */
    public FastRenException(Integer code, String message) {
        super(code, message);
    }

    /**
     * Instantiates a new Fast ren exception.
     *
     * @param code    the code
     * @param message the message
     * @param data    the data
     */
    public FastRenException(Integer code, String message, Object data) {
        super(code, message, data);
    }
}
