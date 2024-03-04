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

WebUI.navigateToUrl('https://ufcic-uat.clariondoor.com/dashboard?filterId=6538300d7cd52')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/button_OK'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/input_Warning_Email'), 'rodrigo.denis@combinedratio.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/input_Warning_Password'), 
    'ztrs+uhznPQVDoM3UGXGbQ==')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/a_Login'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/a_Start New Quote'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/input_Enter account name up to 100 characte_f995ea'), 
    'Excess Smoke Test by RD')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/input_Doing Business As (DBA)_dbaName'), 
    'DBA TEST ')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/span_Excess'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/select_Corporation  Individual  Joint Ventu_c631ef'), 
    'Corporation', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/select_Northeast Coverages, Inc. - Garden C_f8b57d'), 
    'Northeast Coverages, Inc. - Garden City NY (1006-001)', false)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/span_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_AL  AR  AZ  CA  CO  DC  DE  FL  GA  _6b5656'), 
    'CA', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip_loc_0_locZip'), 
    '47130')

WebUI.click(findTestObject('Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_0_locStreet'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_0_locStreet'), 
    'Page PI 100th')

WebUI.click(findTestObject('Test Case Excess by RD/Page_Quoting Portal - 65e223117c979/button_Add  Location'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip_loc_1_locZip'), 
    '94070')

WebUI.click(findTestObject('Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_1_locStreet'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_1_locStreet'), 
    'Page 100th')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Included  Excluded'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_8e714a'), 
    '4000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Primary  Excess'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_0c9efd'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_0c9efd_1'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/div_Automobile Liability   required false'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Automobile Liability'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/div_Logout_loading-container'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Employee Benefits Liability'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Employers Liability'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Completed, signed, and dated ACORD app_a1b34f'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Completed, signed, and dated Supplemen_2bcca2'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_5 Years currently valued loss runs'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Underlying Binders'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Complete General Liability, Employers _c66e9e'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Description_exAddSubjectives_0_exAddS_4dd6ca'), 
    'Test Desc')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULGLArray_0_exCarrierName'), 
    'Carrier Test')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_PolicyQuote Number_exULGLArray_0_exUL_e9ff26'), 
    '16320')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULGLArray_0_exULEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_1'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULGLArray_0_exULExpDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_30'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_0c9efd_1_2'), 
    '3000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(select)  3,000,000  4,000,000  5,00_2fc9ab'), 
    '3000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(select)  3,000,000  Included  Excluded'), 
    '3000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_52d254'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Underlying GL Premium_exULGLArray_0_e_8ede46'), 
    '1,500')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1  Pa, Jeffersonville, IN, 47130,6  _f82e7e'), 
    '1 => Pa, Jeffersonville, IN, 47130,6', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Buildng_exULGLArray_0_exGLLocation_0__f5934c'), 
    '1')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Class Code_exULGLArray_0_exGLLocation_a36977'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_(38605) Abrasive Wheel Manufacturing'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Units of Exposure_exULGLArray_0_exGLL_eb2adf'), 
    '150,000')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULALArray_0_exALCarrier'), 
    'Test Name')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_PolicyQuote Number_exULALArray_0_exUL_39af3c'), 
    '15633')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULALArray_0_exULALEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_8'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULALArray_0_exULALExpDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_17'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Underlying Auto Liability Premium_exU_3f0a17'), 
    '500')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Hired and Non-Owned Auto Coverage'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Hired Auto Cost per Hire_exULALArray__48a351'), 
    '1,500')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Non-Owned Auto ( of employees)_exULAL_c03e03'), 
    '950')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Total Scheduled Autos and Hired  Non-_0c781e'), 
    '350')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip Code_exULALArray_0_exALLocation_0_a1f244'), 
    '32303')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(Select)  Private Passenger Types Cl_db109a'), 
    'Private Passenger Types Classifications', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Vehicles_exULALArray_0_exALLocation_0_a456aa'), 
    '15')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Add'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Add'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_2_icon ml-1'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/div_2_rep-info-title'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip Code_exULALArray_0_exALLocation_1_043bea'), 
    '47130')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(Select)  Private Passenger Types Cl_db109a_1'), 
    'Heavy Truck-tractors (0 - 45,000 lbs. GCW)', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Service  Retail  Commercial'), 
    'Retail', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Contractors  Truckers and Misc'), 
    'Contractors', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Vehicles_exULALArray_0_exALLocation_1_83d279'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULEBLArray_0_exEBLCarrier'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Quote_exULEBLArray_0_exULEBLQuoteNum'), 
    '156442')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Policy_exULEBLArray_0_exULEBLPolNum'), 
    '1522-1412s')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULEBLArray_0_exULEBLEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_2'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULEBLArray_0_exULEB_3e940c'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_17'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000_1'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULELArray_0_exELCarrier'), 
    'Test Name')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Quote_exULELArray_0_exULELQuoteNum'), 
    '157655')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Policy_exULELArray_0_exULELPolNum'), 
    '1522-452-pkj')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULELArray_0_exULELEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_21'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULELArray_0_exULELExpDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_24'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000_1_2'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Add  Employers  Liability  Policy__be5c1a'), 
    'Test\nTest')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Layer 2-2M Excess_check'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Re-Rate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Layer 5-5M Excess_check'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Re-Rate'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_IRPM_excessIRPM'), 
    '3')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Re-Rate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Message_excessRequest'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip Code_insuredZip'), 
    '28792')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_insuredStreet'), 
    'Street RD test')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Commercial Excess Liability Declarati_cbf8c2'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Commercial Excess Liability Coverage _1a36df'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Exclusion - ProductsCompleted Work Ha_b8aa9f'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Assault  Battery Exclusion_UGLX 5081'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Total Liquor and Intoxicating Substan_ab1e32'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Total Auto Exclusion_UGLX 5099'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/label_UGLX 5100'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Tenant Other Insurance Requirements-A_e53abe'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_UGLX 5107_UGLX 5112'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Business Description_businessDescription'), 
    'Test BD')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Number of years in Business_numberOfY_b1d71d'), 
    '15')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Experience_experience'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Auto Summary_autoSummary'), 
    'Auto Test')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Loss Experience_lossExperience'), 
    'Loss Exp TEST')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Reason_reason'), 
    'TEST')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Yes  No'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_concat(  , , required, ,  true)_no_87b019'), 
    'TEST NOTE')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Company Representative_insuredAgent'), 
    'TEST TEST TEST')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Susan Altrock  Antoinette Hardy-Many_5a52d7'), 
    'Susan Altrock', true)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Date_dateSummary'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_30'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Excess Quote Letter'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ufcic-uat.clariondoor.com/dashboard?filterId=6538300d7cd52')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/button_OK'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/input_Warning_Email'), 'rodrigo.denis@combinedratio.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/input_Warning_Password'), 
    'ztrs+uhznPQVDoM3UGXGbQ==')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/a_Login'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal/a_Start New Quote'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/input_Enter account name up to 100 characte_f995ea'), 
    'Excess Smoke Test by RD')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/input_Doing Business As (DBA)_dbaName'), 
    'DBA TEST ')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/span_Excess'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/select_Corporation  Individual  Joint Ventu_c631ef'), 
    'Corporation', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/select_Northeast Coverages, Inc. - Garden C_f8b57d'), 
    'Northeast Coverages, Inc. - Garden City NY (1006-001)', false)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - New Quote/span_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_AL  AR  AZ  CA  CO  DC  DE  FL  GA  _6b5656'), 
    'CA', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip_loc_0_locZip'), 
    '47130')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_0_locStreet'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_0_locStreet'), 
    'Page PI 100th')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e223117c979/button_Add  Location'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip_loc_1_locZip'), 
    '94070')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_1_locStreet'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_loc_1_locStreet'), 
    'Page 100th')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Included  Excluded'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_8e714a'), 
    '4000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Primary  Excess'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_0c9efd'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_0c9efd_1'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/div_Automobile Liability   required false'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Automobile Liability'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/div_Logout_loading-container'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Employee Benefits Liability'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Employers Liability'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Completed, signed, and dated ACORD app_a1b34f'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Completed, signed, and dated Supplemen_2bcca2'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_5 Years currently valued loss runs'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Underlying Binders'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Complete General Liability, Employers _c66e9e'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Description_exAddSubjectives_0_exAddS_4dd6ca'), 
    'Test Desc')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULGLArray_0_exCarrierName'), 
    'Carrier Test')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_PolicyQuote Number_exULGLArray_0_exUL_e9ff26'), 
    '16320')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULGLArray_0_exULEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_1'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULGLArray_0_exULExpDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_30'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_0c9efd_1_2'), 
    '3000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(select)  3,000,000  4,000,000  5,00_2fc9ab'), 
    '3000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(select)  3,000,000  Included  Excluded'), 
    '3000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000  3,000,000  4,0_52d254'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Underlying GL Premium_exULGLArray_0_e_8ede46'), 
    '1,500')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1  Pa, Jeffersonville, IN, 47130,6  _f82e7e'), 
    '1 => Pa, Jeffersonville, IN, 47130,6', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Buildng_exULGLArray_0_exGLLocation_0__f5934c'), 
    '1')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Class Code_exULGLArray_0_exGLLocation_a36977'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_(38605) Abrasive Wheel Manufacturing'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Units of Exposure_exULGLArray_0_exGLL_eb2adf'), 
    '150,000')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULALArray_0_exALCarrier'), 
    'Test Name')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_PolicyQuote Number_exULALArray_0_exUL_39af3c'), 
    '15633')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULALArray_0_exULALEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_8'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULALArray_0_exULALExpDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_17'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Underlying Auto Liability Premium_exU_3f0a17'), 
    '500')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Hired and Non-Owned Auto Coverage'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Hired Auto Cost per Hire_exULALArray__48a351'), 
    '1,500')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Non-Owned Auto ( of employees)_exULAL_c03e03'), 
    '950')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Total Scheduled Autos and Hired  Non-_0c781e'), 
    '350')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip Code_exULALArray_0_exALLocation_0_a1f244'), 
    '32303')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(Select)  Private Passenger Types Cl_db109a'), 
    'Private Passenger Types Classifications', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Vehicles_exULALArray_0_exALLocation_0_a456aa'), 
    '15')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Add'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Add'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_2_icon ml-1'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/div_2_rep-info-title'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip Code_exULALArray_0_exALLocation_1_043bea'), 
    '47130')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_(Select)  Private Passenger Types Cl_db109a_1'), 
    'Heavy Truck-tractors (0 - 45,000 lbs. GCW)', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Service  Retail  Commercial'), 
    'Retail', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Contractors  Truckers and Misc'), 
    'Contractors', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Vehicles_exULALArray_0_exALLocation_1_83d279'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULEBLArray_0_exEBLCarrier'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Quote_exULEBLArray_0_exULEBLQuoteNum'), 
    '156442')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Policy_exULEBLArray_0_exULEBLPolNum'), 
    '1522-1412s')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULEBLArray_0_exULEBLEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_2'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULEBLArray_0_exULEB_3e940c'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_17'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000_1'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Carrier Name_exULELArray_0_exELCarrier'), 
    'Test Name')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Quote_exULELArray_0_exULELQuoteNum'), 
    '157655')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Policy_exULELArray_0_exULELPolNum'), 
    '1522-452-pkj')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Effective Date_exULELArray_0_exULELEffDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_21'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Expiration Date_exULELArray_0_exULELExpDate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_24'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_1,000,000  2,000,000_1_2'), 
    '1000000', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Add  Employers  Liability  Policy__be5c1a'), 
    'Test\nTest')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Layer 2-2M Excess_check'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Re-Rate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Layer 5-5M Excess_check'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Re-Rate'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_IRPM_excessIRPM'), 
    '3')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Re-Rate'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Message_excessRequest'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Zip Code_insuredZip'), 
    '28792')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Street_insuredStreet'), 
    'Street RD test')

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Commercial Excess Liability Declarati_cbf8c2'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Commercial Excess Liability Coverage _1a36df'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Exclusion - ProductsCompleted Work Ha_b8aa9f'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Assault  Battery Exclusion_UGLX 5081'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Total Liquor and Intoxicating Substan_ab1e32'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Total Auto Exclusion_UGLX 5099'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/label_UGLX 5100'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Tenant Other Insurance Requirements-A_e53abe'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_UGLX 5107_UGLX 5112'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_Next'))

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Business Description_businessDescription'), 
    'Test BD')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Number of years in Business_numberOfY_b1d71d'), 
    '15')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Experience_experience'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Auto Summary_autoSummary'), 
    'Auto Test')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Loss Experience_lossExperience'), 
    'Loss Exp TEST')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Reason_reason'), 
    'TEST')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Yes  No'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_concat(  , , required, ,  true)_no_87b019'), 
    'TEST NOTE')

WebUI.setText(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/textarea_Company Representative_insuredAgent'), 
    'TEST TEST TEST')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/select_Susan Altrock  Antoinette Hardy-Many_5a52d7'), 
    'Susan Altrock', true)

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/input_Date_dateSummary'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/span_30'))

WebUI.click(findTestObject('Object Repository/Test Case Excess by RD/Page_Quoting Portal - 65e21db8a6e03/a_Excess Quote Letter'))

