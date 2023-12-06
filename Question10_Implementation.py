

from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
driver = webdriver.Chrome()  
#driver=webdriver.firefox()  
#driver=webdriver.ie()  
#maximize the window size  
driver.maximize_window()  
#navigate to the url  
driver.get("https://www.automationanywhere.com/")  
time.sleep(2)
driver.find_element(By.ID, "onetrust-accept-btn-handler").click()
menu_element = driver.find_element(By.XPATH, "//a[text()=\"Products\"]")

# Perform mouseover action using ActionChains
actions = ActionChains(driver)
actions.move_to_element(menu_element).perform()
time.sleep(2)
driver.find_element(By.XPATH,"(//a[text()=\"Process Discovery\"])[2]").click()
time.sleep(2)

get_url = driver.current_url
if(str(get_url)=="https://www.automationanywhere.com/products/process-discovery"):
    print("URL Verified")
