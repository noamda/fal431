package com.emc.fal431.wrappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class SetPasswordParams {

    private String username;
    private byte[] currentPassword;
    private byte[] newPassword;

}
