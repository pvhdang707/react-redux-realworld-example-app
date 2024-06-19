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

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/Page_Conduit/input_Need an account_form-control form-control-lg'), 'dang@example.com')

WebUI.setText(findTestObject('Object Repository/Page_Conduit/input_Need an account_form-control form-control-lg'), 'dang')

WebUI.click(findTestObject('Object Repository/Page_Conduit/button_Sign in'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_abc Feed'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Conduit/h1_quantifying the circuit wont do anything_5e0bca'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/Page_Conduit/textarea_nemo_form-control'), 't')

WebUI.setText(findTestObject('Object Repository/Page_Conduit/textarea_t'), 'te')

WebUI.setText(findTestObject('Object Repository/Page_Conduit/textarea_te'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Conduit/textarea_tes'), 'tess')

WebUI.setText(findTestObject('Object Repository/Page_Conduit/textarea_tess'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Conduit/textarea_tes'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Conduit/button_Post Comment'))

WebUI.closeBrowser()

