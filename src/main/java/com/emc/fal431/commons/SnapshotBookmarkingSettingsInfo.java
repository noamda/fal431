package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlType(name = "SnapshotBookmarkingSettingsInfo")
public class SnapshotBookmarkingSettingsInfo {
    private SnapshotConsistencyType consistencyType;
    private BookmarkConsolidationPolicy consolidationPolicy;
}
