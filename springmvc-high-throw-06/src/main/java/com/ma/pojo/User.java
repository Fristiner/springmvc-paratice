package com.ma.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.util.Date;

/* *
 * @packing com.ma.pojo
 * @author mtc
 * @date 13:00 09 29 13:00
 *
 */

//TODO：参数校验
// 1.name 不为null @NotBlank
//  字符串@NotBlank 集合 @NotEmpty 包装@NotNull
// 2.password 长度大于6

@Data
public class User {

    @NotBlank
    private String name;

    private String password;
    @Min(1)
    private int age;
    @Email
    private String email;
    @Past
    private Date birthday;

}
