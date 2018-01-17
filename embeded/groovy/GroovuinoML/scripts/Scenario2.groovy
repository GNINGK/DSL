sensor "button1" onPin 9
sensor "button2" onPin 10
actuator "led1" pin 11
actuator "led2" pin 12

state "on" means "led1" becomes "high" and "led2" becomes "high"
state "off" means "led1" becomes "low" and "led2" becomes "low"

initial "off"

from "off" to "on" when "button1" becomes "high" and "button2" becomes "high"
from "on" to "off" when "button1" becomes "low" or "button2" becomes "low"

export "Scenario2!"