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

WebUI.navigateToUrl('https://demo.guru99.com/V4/')

WebUI.waitForPageLoad(5)

WebUI.comment('Get UserID Password')

WebUI.click(findTestObject('Practice 9/Here link'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Practice 9/EmailID'), 'uyen.ta@aperia.com')

WebUI.click(findTestObject('Practice 9/Button_Submit'))

WebUI.getText(findTestObject('Practice 9/GetUserName'))

WebUI.getText(findTestObject('Practice 9/GetPassword'))

WebUI.comment('Enter Username Password')

WebUI.navigateToUrl('https://demo.guru99.com/V4/')

WebUI.setText(findTestObject('Practice 9/GetUserName'), '')

WebUI.setText(findTestObject('Practice 9/GetPassword'), '')

WebUI.click(findTestObject('Practice 9/Button_Login'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementPresent(findTestObject('Practice 9/TextWelcome'), 0)

