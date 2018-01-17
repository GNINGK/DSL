sensor "button_1" onPin 9
sensor "button_2" pin 10
actuator "buzzer" pin 11

state "on" means "buzzer" becomes "high"
state "off" means buzzer becomes low

initial "off"

from "off" to "on" when button_1 becomes high and button_2 becomes high
from "on" to "off" when button_1 becomes low or button_2 becomes low


export "Scenario 2!"