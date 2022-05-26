package command.classes.cmd;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import command.classes.constants.CommandClassesPortletKeys;

@Component(
		immediate = true,
		property = {
			
			"javax.portlet.name=command_classes_CommandClassesPortlet" ,
			"mvc.command.name=viewleave_info"
			
		},
		service = MVCRenderCommand.class
	)
public class RenderExampleCMD implements MVCRenderCommand{

	public final static String VIEW_LEAVE_INFO ="/leave/leaveInfo.jsp";
	public final static String ERROR ="/leave/error.jsp";
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		System.out.println("in render-ViewLeaveInfoCmd");
		try {
			long leaveId=ParamUtil.getLong(renderRequest,"leaveID",-1L);
			System.out.println("::::::::::::::::::::::::::::::::::::"+leaveId);
		}
		catch(Exception e)
		{
			return ERROR;
		}
		return VIEW_LEAVE_INFO;
	}
	

}

