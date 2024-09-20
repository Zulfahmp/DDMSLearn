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

TestData user = findTestData('user')

//ngambil jumlah data
int rowCount = user.getRowNumbers()

WebUI.callTestCase(findTestCase('Helper/OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

for (int i = 0; i < rowCount; i++) {
	
    //ngambil data dari username atau password
    String usernameExcel = user.getValue('username', i + 1)

    String passwordEcxel = user.getValue('password', i + 1)

    WebUI.setText(findTestObject('LoginPage/fieldUsername'), usernameExcel)

    WebUI.setText(findTestObject('LoginPage/fieldPassword'), GlobalVariable.password)

    WebUI.click(findTestObject('LoginPage/buttonLogin'))

    WebUI.verifyElementPresent(findTestObject('LoginPage/alertWrong'), 0)

    txtAlertWrongUsername = WebUI.getText(findTestObject('LoginPage/alertWrong'))

    WebUI.verifyEqual(txtAlertWrongUsername, alertUsername)

    WebUI.setText(findTestObject('LoginPage/fieldUsername'), GlobalVariable.username)

    WebUI.setText(findTestObject('LoginPage/fieldPassword'), passwordEcxel)

    WebUI.click(findTestObject('LoginPage/buttonLogin'))

    WebUI.verifyElementPresent(findTestObject('LoginPage/alertWrong'), 0)

    txtAlertWrongPassword = WebUI.getText(findTestObject('LoginPage/alertWrong'))

    WebUI.verifyEqual(txtAlertWrongPassword, alertPassword)
}

