import pytest import time
from selenium import webdriver

from selenium.webdriver.common.by import By from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait

from selenium.webdriver.support import expected_conditions as EC 
from selenium.webdriver.chrome.options import Options 
@pytest.fixture
def driver():

	chrome_options = Options() zoom_level = 0.90
	chrome_options.add_argument("--disable-device-emulation") chrome_options.add_argument(f"--force-device-scale-factor={zoom_level}") driver = webdriver.Chrome(chrome_options)
	driver.maximize_window() yield driver
	
	driver.quit()
	
def test_flipkart_eCommerce_project(driver):
	
	# Step 1: Launch the URL and verify "Flipkart" is present on the page url = "https://www.flipkart.com/"
	driver.get(url) time.sleep(5)
	driver.find_element(By.XPATH, "//span[@class=\"_30XB9F\"]").click() time.sleep(5)
	search_box = driver.find_element(By.XPATH, "//input[@class=\"Pke_EE\"]") search_box.send_keys("Macbook air m2") search_box.send_keys(Keys.ENTER)
	time.sleep(5)
	
	first_item = driver.find_element(By.XPATH, "(//div[@class=\"col col-7-12\"])[1]") first_item.click()
	time.sleep(5) driver.switch_to.window(driver.window_handles[1]) time.sleep(5)
	add_to_cart_button = driver.find_element(By.XPATH, "//button[@class=\"_2KpZ6l _2U9uOA _3v1- ww\"]")
	
	add_to_cart_button.click() time.sleep(5)
	cart_icon = driver.find_element(By.XPATH, "//span[text()=\"Cart\"]") cart_icon.click()
	time.sleep(5)
	
	added_item = driver.find_element(By.XPATH, "//a[@class=\"_2Kn22P gBNbID\"]") assert "MacBook AIR Apple M2" in added_item.text
	