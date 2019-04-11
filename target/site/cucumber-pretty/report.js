$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/shakibkarim/Downloads/bootcamp_website/src/test/resources/features/HotelsProject.feature");
formatter.feature({
  "line": 2,
  "name": "Hotels.com feature",
  "description": "",
  "id": "hotels.com-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open the default browser and I am on hotel deals page",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSD.before()"
});
formatter.result({
  "duration": 11944923461,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot get automation extension\nfrom unknown error: page could not be found: chrome-extension://aapnijgdinlhnhlmodcfapnahmbfebeb/_generated_background_page.html\n  (Session info: chrome\u003d72.0.3626.119)\n  (Driver info: chromedriver\u003d2.29.461585 (0be2cd95f834e9ee7c46bcc7cf405b483f5ae83b),platform\u003dMac OS X 10.14.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.09 seconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027dyn-129-236-180-169.dyn.columbia.edu\u0027, ip: \u0027fe80:0:0:0:1009:1968:fb1c:18b4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.3\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461585 (0be2cd95f834e9ee7c46bcc7cf405b483f5ae83b), userDataDir\u003d/var/folders/fp/ttz4zcxx79v0599hcs9l_x7h0000gn/T/.org.chromium.Chromium.OLlTDQ}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d72.0.3626.119, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e761253361254f25c73d073c4d3ee6fb\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.setSize(RemoteWebDriver.java:890)\n\tat stepdefinition.SharedSD.before(SharedSD.java:31)\n\tat ✽.Given I open the default browser and I am on hotel deals page(/Users/shakibkarim/Downloads/bootcamp_website/src/test/resources/features/HotelsProject.feature:6)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 55,
  "name": "Verify user can select number of rooms, adults and children age at check in before showing deals in CheckInPage",
  "description": "",
  "id": "hotels.com-feature;verify-user-can-select-number-of-rooms,-adults-and-children-age-at-check-in-before-showing-deals-in-checkinpage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 54,
      "name": "@regression-3"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "User enters \"New York\" in Destination text field",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "User selects first destination from the suggestions",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User selects \"08/25/2017\" Check-In date",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User selects \"08/30/2017\" Check-Out date",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User clicks on edit or add rooms button",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "User selects more than 1 room",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User select the number of adults in each room",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "User select the number of children in each room",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "User select the age of children at check-in",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User clicks on show deals",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User should be able to see deals of rooms for the given amount of adults and children below the name of the specified destination under the header of the page.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 13
    }
  ],
  "location": "AtCheckInPageSD.ienterAnyDestinationName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.icloseListOfSuggestions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"08/25/2017\"",
      "offset": 13
    }
  ],
  "location": "AtCheckInPageSD.iClickCheckInDate(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"08/30/2017\"",
      "offset": 13
    }
  ],
  "location": "AtCheckInPageSD.iClickCheckOutDate(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.iEditRooms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.iSelectRooms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.iSelectAdults()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.iSelectChildren()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.iSelectChildAge()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.iClickShowDeals()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AtCheckInPageSD.iVerifyUserDetails()"
});
formatter.result({
  "status": "skipped"
});
});