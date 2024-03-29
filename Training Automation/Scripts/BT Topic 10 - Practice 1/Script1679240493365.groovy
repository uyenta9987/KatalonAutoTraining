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

WebUI.navigateToUrl('https://www.fahasa.com/customer/account/create')

WebUI.click(findTestObject('Paractice 10 - Bai 1 - Fahasa/Tab_DangNhap'))

WebUI.verifyElementNotClickable(findTestObject('Paractice 10 - Bai 1 - Fahasa/Button_DangNhap'))

WebUI.setText(findTestObject('Paractice 10 - Bai 1 - Fahasa/Textbox_Username'), '0917868690')

WebUI.setEncryptedText(findTestObject('Paractice 10 - Bai 1 - Fahasa/Textbox_Password'), 'Mht99fgjH2A=')

WebUI.verifyElementClickable(findTestObject('Paractice 10 - Bai 1 - Fahasa/Button_DangNhap'))

WebUI.click(findTestObject('Paractice 10 - Bai 1 - Fahasa/Button_DangNhap'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Paractice 10 - Bai 1 - Fahasa/Title_saiPassword'), 'Số điện thoại/Email hoặc Mật khẩu sai!')

