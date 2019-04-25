package com.suxia.toshow.domian;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaoyc@ebikj.com
 * @version v_1.0.0
 * @date Created in 2019年04月25 17:05 星期四
 * @description TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseDomain implements Serializable {

    private static final long serialVersionUID = -4699930398671299400L;

    private Long id;
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

}
