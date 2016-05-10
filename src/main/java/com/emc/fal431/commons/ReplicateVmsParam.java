package com.emc.fal431.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.HashSet;

@XmlRootElement
@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicateVmsParam")
public class ReplicateVmsParam implements Validateable {

    @XmlElement(required = true)
    private String cgName;
    @XmlElement(required = true)
    private GlobalCopyUID productionCopy;
    @XmlElement(required = true)
    private HashSet<VMReplicationSetParam> vmReplicationSets;
    private HashSet<FullConsistencyGroupLinkPolicy> links;
    @XmlElement(required = true)
    private HashSet<ConsistencyGroupCopyParam> copies;
    @XmlElement(required = true)
    private boolean startTransfer;
    
    
    public HashSet<VMReplicationSetParam> getVmReplicationSets()
      {
         if (vmReplicationSets == null) {
           vmReplicationSets = new HashSet<VMReplicationSetParam>();
         }
         return vmReplicationSets;
      }

      public HashSet<FullConsistencyGroupLinkPolicy> getLinks()
       {
         if (links == null) {
           links = new HashSet<FullConsistencyGroupLinkPolicy>();
         }
         return links;
       }

       public HashSet<ConsistencyGroupCopyParam> getCopies()
       {
         if (copies == null) {
           copies = new HashSet<ConsistencyGroupCopyParam>();
         }
         return copies;
       }

}
