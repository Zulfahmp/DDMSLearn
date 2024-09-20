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
import org.aspectj.apache.bcel.classfile.LocalVariable as LocalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Helper/OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/001_Login_With_Valid_Data'), [('textExpected') : 'admin-100002'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('DashboardPage/textUsername'), 0)

WebUI.scrollToElement(findTestObject('DashboardPage/miscellaneousUnit'), 0)

WebUI.click(findTestObject('DashboardPage/miscellaneousUnit'))

WebUI.verifyElementPresent(findTestObject('MiscallaneousUnitPage/createMiscInOutsubMenu'), 0)

WebUI.click(findTestObject('MiscallaneousUnitPage/createMiscInOutsubMenu'))

WebUI.verifyElementPresent(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/fieldNoTransaksi'), 0)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/dropdownJenisMiscUnit'))

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/valueJenisMiscUnit'))

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/dropdownAlasanMiscUnit'))

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/valueAlasanMiscUnit'))

noTransaksi = WebUI.getAttribute(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/fieldNoTransaksi'), 'value')

WebUI.setText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/fieldKeteranganMiscUnit'), 'Barang Masuk Kita')

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/buttonCreate'))

WebUI.verifyElementPresent(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldTipeUnit'), 
    0)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/btnSearchTipeUnit'))

WebUI.verifyElementPresent(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/CariTipeUnit/fieldSearch'), 
    0)

WebUI.setText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/CariTipeUnit/fieldSearch'), 
    tipeunit)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/CariTipeUnit/btnSearchUnit'))

resultTipeUnit = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/CariTipeUnit/resultTipeUnitIndex1'))

WebUI.verifyEqual(resultTipeUnit, tipeunit)

resultKodeTipe = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/CariTipeUnit/resultKodeTipeIndex1'))

WebUI.verifyEqual(resultKodeTipe, kodetipe)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/CariTipeUnit/btnPlusIndex1'))

tipeunitAfterChosen = WebUI.getAttribute(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldTipeUnit'), 
    'value')

WebUI.verifyEqual(tipeunitAfterChosen, resultTipeUnit)

kodetipeAfterChosen = WebUI.getAttribute(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldKodeTipe'), 
    'value')

WebUI.verifyEqual(kodetipeAfterChosen, resultKodeTipe)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/dropdownWarnaUnit'))

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/valueWarnaUnit'))

String warnaUnit = WebUI.getAttribute(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/dropdownWarnaUnit'), 
    'value')

String warnaTanpaKode = warnaUnit.substring(5)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/dropdownLocator'))

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/valueLocator'))

locator = WebUI.getAttribute(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/dropdownLocator'), 
    'value')

GlobalVariable.gNoMesin = (nomesin + randomNumber(7))

GlobalVariable.gNoRangka = randomNumber(14)

WebUI.setText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldNoMesin'), GlobalVariable.gNoMesin)

WebUI.setText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldNoRangka'), GlobalVariable.gNoRangka)

WebUI.setText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldHargaPerolehan'), hargaperolehan)

WebUI.setText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldPPh'), pph)

WebUI.setText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/fieldDiskon'), diskon)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/dropdownTahunRakit'))

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/valueTahunRakit'))

tahunRakit = WebUI.getAttribute(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/dropdownTahunRakit'), 
    'value')

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/CreateTransaksiMiscUnit/btnSimpan'))

WebUI.verifyElementPresent(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/fieldNoTransaksi'), 0)

WebUI.scrollToElement(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textTipeUnit'), 0)

tipeunitWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textTipeUnit'))

WebUI.verifyEqual(tipeunitWillSub, tipeunit)

kodetipeWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textKodeTipe'))

WebUI.verifyEqual(kodetipeWillSub, kodetipe)

nomesinWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textNoMesin'))

WebUI.verifyEqual(nomesinWillSub, GlobalVariable.gNoMesin)

norangkaWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textNoRangka'))

WebUI.verifyEqual(norangkaWillSub, GlobalVariable.gNoRangka)

warnaunitWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textWarnaUnit'))

WebUI.verifyEqual(warnaunitWillSub, warnaTanpaKode)

locatorWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textLocator'))

WebUI.verifyEqual(locatorWillSub, locator)

String hargaWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textHargaPerolehan'))

String hargaTanpaKoma = hargaWillSub.replace(',', '')

WebUI.verifyEqual(hargaTanpaKoma, hargaperolehan)

tahunWillSub = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/textTahun'))

WebUI.verifyEqual(tahunWillSub, tahunRakit)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/btnSubmit'))

WebUI.verifyElementPresent(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/alertBerhasilSimpan'), 0)

String textBerhasilSimpan = WebUI.getText(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/alertBerhasilSimpan'))

String textBerhasilSimpanClear = textBerhasilSimpan.substring(13, 34)

WebUI.verifyEqual(noTransaksi, textBerhasilSimpanClear)

WebUI.click(findTestObject('MiscallaneousUnitPage/CreateMiscInOutMenu/btnOK'))

static String randomNumber(int length) {
    Random random = new Random()

    String rNumber = ''

    for (int i = 0; i < length; i++) {
        rNumber += random.nextInt(10)
    }
    
    return rNumber
}

