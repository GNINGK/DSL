sensor "button" onPin 9
actuator "led" pin 11

state "on" means "led" becomes "high"
state "off" means led becomes low

initial "off"

from "off" to "on" when led becomes high
from "on" to "off" when led becomes high

export "Scenario 3!"