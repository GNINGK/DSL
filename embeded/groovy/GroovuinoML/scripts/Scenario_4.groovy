sensor "button" onPin 9
actuator "buzzer" pin 11
actuator "led" pin 12

state "light" means buzzer becomes "low" and "led" becomes "high"
state "buzzing" means "buzzer" becomes "high"
state "off" means led becomes low

initial "off"

from "off" to "buzzing" when button becomes high
from "buzzing" to "light" when button becomes high
from "light" to "off" when button becomes high

export "Scenario 4!"