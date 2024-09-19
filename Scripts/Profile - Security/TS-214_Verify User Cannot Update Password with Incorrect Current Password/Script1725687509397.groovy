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

WebUI.navigateToUrl('https://dev.premium.enigmacamp.com/')

WebUI.click(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/button_Login'))

WebUI.setText(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/input_Email_email'), 
    'jagoo.it@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/input_Password_password'), 
    'W5ppkIzt90NEQesuAq6ZDA==')

WebUI.sendKeys(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/div_Profile'))

WebUI.click(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/div_Security'))

WebUI.setEncryptedText(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/input_Password_password'), 
    'lVoqLulbz6PHgMCQJBZYZg==')

WebUI.verifyEqual('XyzXyz*1Op', 'Userxyz*123!')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/input_New Password_newPassword'), 
    'Gp4bvSdAzbQbBoS1Nw/4rg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/input_Confirmation New Password_confirmPassword'), 
    'Gp4bvSdAzbQbBoS1Nw/4rg==')

WebUI.verifyEqual('Asdf*Asdf0', 'Asdf*Asdf0')

WebUI.click(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/button_Save Password'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/img_Save Password_border-img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/span_Password Updated'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/span_Your password has been changed successfully'), 
    5)

WebUI.click(findTestObject('Object Repository/Profile - Security - Objects/Update Profile Security/Page_Premium Class/button_Ok'))

WebUI.refresh()

WebUI.closeBrowser()

