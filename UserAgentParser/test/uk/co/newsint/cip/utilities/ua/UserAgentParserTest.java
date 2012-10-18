package uk.co.newsint.cip.utilities.ua;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

<<<<<<< HEAD

=======
>>>>>>> c9d116599114ddbe090422c97745f22e870acbe0
import org.junit.Test;

/**
 * The UserAgentParserTest class represents a test for UserAgentParser class's
 * methods
 * 
 * @author Georgi Petkov
 * @version 1.0
 * @since 2012-10-12
 * @see UserAgentParser#parse(String)
 */
public class UserAgentParserTest {
<<<<<<< HEAD
	/**
	 * final test strings for different user agents cases
	 */
	public final String agentString1 = "BlackBerry8520/4.6.1.314 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/301,platform,unknown";
	public final String agentString2 = "BlackBerry9300/6.6.0.124 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/310 The Times/1.0,platform,unknown";
	public final String agentString3 = null;
	public final String agentString4 = "adsasdsas";
	public final String agentString5 = "BlackBerry9105/6.6.0.200 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/332 The Times/1.0,platform,unknown";
	public final String agentString6 = "BlackBerry9105/5.0.0.748 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/125,platform,unknown";
	public final String agentString7 = "BlackBerry9320/9.49.0.31 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/118 The Times/1.0,platform,unknown";
	public final String agentString8 = "BlackBerry8520/4.6.1.314 Configuration/CLDC-1.1 VendorID/603Profile/MIDP-2.0 ,platform,unknown";
=======
>>>>>>> c9d116599114ddbe090422c97745f22e870acbe0

	/**
	 * Instance of type UserAgentParser which method "parse" we're using
	 * 
	 */
	private static UserAgentParser testUserAgentParser = new UserAgentParser() {
	};

	/**
	 * Method which tests the different cases for user agent string
	 * 
	 * @see UserAgentParser#parse(String)
	 * 
	 */
	@Test
<<<<<<< HEAD
	public void testParse() throws Exception {
		
		// Assert for version 4.
		equalUserAgent(
				"BlackBerry8520/4.6.1.314 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/301",
				new UserAgent("BlackBerry", "8520", "8520", "OS4", "4.6.1.314", UserAgent.DeviceType.SMARTPHONE));
		
		//Assert for version 5.
				equalUserAgent(
						"BlackBerry9105/5.0.0.748 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/125",
						new UserAgent("BlackBerry", "9105", "9105", "OS5", "5.0.0.748", UserAgent.DeviceType.SMARTPHONE));
		// Assert for version 6.
		equalUserAgent(
				"BlackBerry9300/6.6.0.124 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/310 The Times/1.0",
				new UserAgent("BlackBerry", "9300", "9300", "OS6", "6.6.0.124", UserAgent.DeviceType.SMARTPHONE));
		
		//Assert for version 9.
		equalUserAgent(
				"BlackBerry9320/9.49.0.31 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/118 The Times/1.0",
				new UserAgent("BlackBerry", "9320", "9320", "OS9", "9.49.0.31", UserAgent.DeviceType.SMARTPHONE));
		
		//Expected Our custom ParseException
		exceptionThrowing("asdasdsa");
	}
	
	/**
	 * Method which make asserts for the UserAgent's fields
=======
	public void testBlackBerryParse() throws Exception {

		// Assert for version 4.
		assertUserAgentEquals(
				"BlackBerry8520/4.6.1.314 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/301",
				new UserAgent("BlackBerry", "8520", "8520", "OS4", "4.6.1.314",
						UserAgent.DeviceType.SMARTPHONE));

		// Assert for version 5.
		assertUserAgentEquals(
				"BlackBerry9105/5.0.0.748 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/125",
				new UserAgent("BlackBerry", "9105", "9105", "OS5", "5.0.0.748",
						UserAgent.DeviceType.SMARTPHONE));
		// Assert for version 6.
		assertUserAgentEquals(
				"BlackBerry9300/6.6.0.124 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/310 The Times/1.0",
				new UserAgent("BlackBerry", "9300", "9300", "OS6", "6.6.0.124",
						UserAgent.DeviceType.SMARTPHONE));

		// Assert for version 9.
		assertUserAgentEquals(
				"BlackBerry9320/9.49.0.31 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/118 The Times/1.0",
				new UserAgent("BlackBerry", "9320", "9320", "OS9", "9.49.0.31",
						UserAgent.DeviceType.SMARTPHONE));

		// Expected Our custom ParseException
		assertUserAgentException("BlackBerri9320/9.49.0.31 Profile");
	}

	@Test
	public void testAppleParse() throws Exception {
		//
		
	}

	@Test
	public void testAndroidParse() throws Exception {

	}

	@Test
	public void testPCParse() throws Exception {
		// Equal for the PC
		assertUserAgentEquals(
				"Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)",
				new UserAgent(UserAgent.UNKNOWN, "MSIE", "9.0", "Windows NT", "6.1",
						UserAgent.DeviceType.PC));
		assertUserAgentEquals(
				"Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)",
				new UserAgent(UserAgent.UNKNOWN, "MSIE", "9.0", "Windows NT", "6.1",
						UserAgent.DeviceType.PC));
	}

	/**
	 * Method which make asserts for for every of the UserAgent's properties
	 * (equal for every of the properties)
>>>>>>> c9d116599114ddbe090422c97745f22e870acbe0
	 * 
	 * @see UserAgentParser#parse(String)
	 * 
	 */
<<<<<<< HEAD
	private void equalUserAgent(String userAgentString,UserAgent expectedUserAgent)throws Exception{
		UserAgent actualUserAgent = testUserAgentParser.parse(userAgentString);
		assertNotNull("Expected UserAgent, but the method returns null",actualUserAgent);
		String templateFail = userAgentString + " >>> ";
		assertEquals(templateFail + "type property", expectedUserAgent.getType(), actualUserAgent.getType());
		assertEquals(templateFail + "hardware property", expectedUserAgent.getHardware(), actualUserAgent.getHardware());
		assertEquals(templateFail + "model property", expectedUserAgent.getModel(), actualUserAgent.getModel());
		assertEquals(templateFail + "model version property", expectedUserAgent.getModelVersion(), actualUserAgent.getModelVersion());
		assertEquals(templateFail + "software property", expectedUserAgent.getSoftware(), actualUserAgent.getSoftware());
		assertEquals(templateFail + "software version property", expectedUserAgent.getSoftwareVersion(), actualUserAgent.getSoftwareVersion());
	}
	
	private void exceptionThrowing(String userAgentString){
		if(userAgentString == null){
			
		}else{
			try{
				testUserAgentParser.parse(userAgentString);
				fail("The method didn't throw ParseException when we use not userAgent string");
			}catch(UserAgentParseException e){
				
			}
		}
=======
	private void assertUserAgentEquals(String userAgentString,
			UserAgent expectedUserAgent) throws Exception {
		UserAgent actualUserAgent = testUserAgentParser.parse(userAgentString);
		assertNotNull("Expected UserAgent, but the method returns null",
				actualUserAgent);
		String templateFail = userAgentString + " >>> ";
		assertEquals(templateFail + "type property",
				expectedUserAgent.getType(), actualUserAgent.getType());
		assertEquals(templateFail + "hardware property",
				expectedUserAgent.getHardware(), actualUserAgent.getHardware());
		assertEquals(templateFail + "model property",
				expectedUserAgent.getModel(), actualUserAgent.getModel());
		assertEquals(templateFail + "model version property",
				expectedUserAgent.getModelVersion(),
				actualUserAgent.getModelVersion());
		assertEquals(templateFail + "software property",
				expectedUserAgent.getSoftware(), actualUserAgent.getSoftware());
		assertEquals(templateFail + "software version property",
				expectedUserAgent.getSoftwareVersion(),
				actualUserAgent.getSoftwareVersion());
	}

	private void assertUserAgentException(String userAgentString) {
		try {
			testUserAgentParser.parse(userAgentString);
			fail("The method didn't throw ParseException when we use not userAgent string");
		} catch (UserAgentParseException e) {
			// I expect this exception --> do nothing
		}

>>>>>>> c9d116599114ddbe090422c97745f22e870acbe0
	}

}
