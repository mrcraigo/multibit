package org.multibit.action;

import org.multibit.Localiser;
import org.multibit.controller.ActionForward;
import org.multibit.controller.MultiBitController;
import org.multibit.model.DataProvider;

/**
 * an action to the help about view
 * 
 * @author jim
 *
 */
public class HelpContentsAction implements Action {

    private MultiBitController controller;
    private Localiser localiser;
    
    public HelpContentsAction(MultiBitController controller, Localiser localiser) {
        this.controller = controller;
        this.localiser = localiser;     
    }
    
    public void execute(DataProvider dataProvider) {
        // no changes required to model
        
        controller.setActionForwardToChild(ActionForward.FORWARD_TO_HELP_CONTENTS);       
    }
    
    public String getDisplayText() {
        // TODO localise
        return "help";
    }
}