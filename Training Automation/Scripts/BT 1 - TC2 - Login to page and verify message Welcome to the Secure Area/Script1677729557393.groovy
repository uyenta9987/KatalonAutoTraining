import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/login')

WebUI.waitForPageLoad(10)

WebUI.comment('Login by valid username and password')

WebUI.setText(findTestObject('Login - internet herokuapp/TextBox_Usename_internet'), 'tomsmith')

WebUI.setEncryptedText(findTestObject('Login - internet herokuapp/Textbox_Pass_internet'), 'T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI')

WebUI.click(findTestObject('Login - internet herokuapp/Button_Login_internet'))

WebUI.waitForPageLoad(10)

WebUI.waitForImagePresent(findTestObject('Login - internet herokuapp/Title Internet'), 10)

WebUI.closeBrowser()

