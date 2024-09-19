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

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/button_Login'))

WebUI.setText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/input_Email_email'), 
    'jagoo.it@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/input_Password_password'), 
    'W5ppkIzt90NEQesuAq6ZDA==')

WebUI.sendKeys(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/i_Log Out_bi bi-cart-dash-fill icon'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Delete all'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/button_Explore Course'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/button_Add To Cart_1'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/button_Add To Cart_1_2'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/i_Log Out_bi bi-cart-dash-fill icon'))

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/i_Customize package_bi bi-chevron-down'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/input_Check  uncheck module according your _cb38bf'))

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp200,000'), 
    'Rp200,000')

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp200,000_1'), 
    'Rp200,000')

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp200,000_1_2'), 
    'Rp200,000')

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp200,000_1_2_3'), 
    'Rp200,000')

WebUI.click(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/input_Rp200,000_custom-input-black'))

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp120,000'), 
    'Rp120,000')

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp1,000,000'), 
    'Rp320,000')

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp1,000,000_1'), 
    'Rp320,000')

WebUI.verifyElementText(findTestObject('Object Repository/Shopping Cart - Objects/Checked Multiple Product Package Objects/Page_Premium Class/span_Rp1,000,000_1_2'), 
    'Rp320,000')

WebUI.closeBrowser()

