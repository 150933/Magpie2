/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @editor Jeremy Tan
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0
				|| statement.indexOf("never") >= 0	//key words that trigger the below response 
				|| statement.indexOf("dont") >= 0
				|| statement.indexOf("don't") >= 0
				)
		{
			response = "Why so negative?";				//response 1
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0		//key words that trigger an alternate response 
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";		//response 2
		}
		
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0		//key words that trigger an alternate response 
				|| statement.indexOf("parrot") >= 0
				|| statement.indexOf("fish") >= 0)
		{
			response = "Tell me more about your pets.";		//response 3
		}
		
		else if (statement.indexOf("mr") >= 0
				|| statement.indexOf("mrs") >= 0
				|| statement.indexOf("mister") >= 0	//key words that trigger an alternate response 
				|| statement.indexOf("Mr") >= 0
				|| statement.indexOf("Mrs") >= 0
				|| statement.indexOf("miss") >= 0)
		{
			response = "He sounds like an interesting fellow.";  //response 4
		}
		
		else if (statement.trim().length()==0)			//if the input is just spaces or blank
		{
			response = "Say something please";		//response 4
		}
		
		else										//if none of the conditions were met...
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);		//produces a random int from 0-5
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		
		else if (whichResponse == 4)
		{
			response = "I see...";
		}
		
		else if (whichResponse == 5)
		{
			response = "Wow. Just wow.";
		}

		return response;
	}
}
