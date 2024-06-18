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

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Conduit/input_Need an account_form-control form-control-lg'), 'dang@example.com')

WebUI.setText(findTestObject('Object Repository/Page_Conduit/input_Need an account_form-control form-control-lg'), 'dang')

WebUI.click(findTestObject('Object Repository/Page_Conduit/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_abc Feed'))

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Conduit/h1_The GB port is down, quantify the mobile_b41252'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Conduit/p_Quaerat officia voluptatum officiis. Quo _0ff14f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Conduit/div_Maksim EstebanThu Jan 04 2024'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Conduit/p_Corrupti aspernatur minus eum. Nihil omni_b3ed20'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Conduit/div_Lihua SaengthongThu Jan 04 2024'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Conduit/span_Thu Jan 04 2024'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Conduit/a_Lihua Saengthong'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Conduit/img_Thu Jan 04 2024_comment-author-img'))

WebUI.closeBrowser()

