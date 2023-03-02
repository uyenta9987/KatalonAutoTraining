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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.waitForPageLoad(5)

WebUI.comment('Login by valid user and password')

WebUI.setText(findTestObject('Login - Book Appointment/Textbox_UserName'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Login - Book Appointment/Textbox_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Login - Book Appointment/Button_Login'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Login - Book Appointment/Title_MakeAppointment'), 10)

WebUI.comment('Login Successful')

WebUI.closeBrowser()

