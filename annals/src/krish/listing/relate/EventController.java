package krish.listing.relate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController 
{

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public ModelAndView showEventForm()
	{
		Event e1 = new Event();
		return new ModelAndView("eventHome", "event", e1);
		
	}
	
	@RequestMapping(value = "/addEvent", method = RequestMethod.POST)
	public String includeEvent(Event e1, ModelMap model)
	{
		
		model.addAttribute("Occurrence", e1.getOccurrence());
		model.addAttribute("Year", e1.getYear());
		model.addAttribute("Country", e1.getCountry());
		model.addAttribute("KeyPerson", e1.getKeyPerson());
		
		return "eventView";
	}
}

