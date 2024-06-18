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

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_conduit'))

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_Maksim Esteban'))

WebUI.click(findTestObject('Object Repository/Page_Conduit/a_My Articles'))

WebUI.click(findTestObject('Object Repository/Page_Conduit/div_Maksim EstebanThu Jan 04 2024 152We nee_424938'))

WebUI.click(findTestObject('Object Repository/Page_Conduit/h1_We need to quantify the primary TCP matrix'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Conduit/p_Sign inorsign upto add comments on this article'), 
    'Sign in or sign up to add comments on this article.')

WebUI.closeBrowser()

