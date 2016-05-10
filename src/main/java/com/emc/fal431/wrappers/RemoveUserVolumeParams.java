package com.emc.fal431.wrappers;

import com.emc.fal431.commons.DeviceUID;
import com.emc.fal431.commons.ReplicationSetUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class RemoveUserVolumeParams {

    private DeviceUID volumeID;
    private ReplicationSetUID replicationSet;

}
