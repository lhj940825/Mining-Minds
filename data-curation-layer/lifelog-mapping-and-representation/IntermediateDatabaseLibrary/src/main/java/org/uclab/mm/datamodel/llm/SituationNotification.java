/*
 Copyright [2016] [Taqdir Ali]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 */
package org.uclab.mm.datamodel.llm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rizvi
 */
@XmlRootElement()
public class SituationNotification implements Serializable {
    
     private String UserID;
    //private List<SituationConditions> ListSConditions = new ArrayList<SituationConditions>();
    private SituationEvent situationEvent = new SituationEvent();

    /**
     * @return the SituationID
     */
    public String getUserID() {
        return UserID;
    }

    /**
     * @param UserID the SituationID to set
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }



    /**
     * @return the situationEvent
     */
    public SituationEvent getSituationEvent() {
        return situationEvent;
    }

    /**
     * @param situationEvent the situationEvent to set
     */
    public void setSituationEvent(SituationEvent situationEvent) {
        this.situationEvent = situationEvent;
    }

    
}
