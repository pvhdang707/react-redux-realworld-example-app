import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pvhdang707.github.io/react-redux-realworld-example-app/')

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_Home'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/a_Maksim Esteban'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/span_Thu Jan 04 2024'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/button_636'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/h1_Ill quantify the redundant TCP bus, that_19cd10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/p_Aut facilis qui. Cupiditate sit ratione e_d6efc2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/span_Read more'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/li_sit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/li_reiciendis'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/li_consequuntur'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/li_nihil'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduit/div_Maksim EstebanThu Jan 04 2024 636Ill qu_ad604a'))

WebUI.closeBrowser()

