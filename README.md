# Spear Lunge

A Meteor Client addon for Minecraft **26.3**, based on Trouser-Streak's `SpearKill`.

This is the base SpearKill port with two changes:

- **Target prediction** for moving players. `Target Prediction` tracks observed target position changes and leads the aim/lunge by the estimated lunge travel time. `0` disables the lead.
- **NoFall is never touched.** The original "Disable NoFall While Charging" setting and all NoFall toggling have been removed. Use Meteor NoFall exactly as normal.

The rest is the original Lunge/Blink implementation, including the original `Stop on target` behavior and `Stop Distance`.

## Usage

1. Put the jar in your `mods` folder next to Meteor Client.
2. Enable **Spear Lunge** in the **Combat** category.
3. Hold a spear, look at the target, and hold right click.
4. To test NoFall compatibility, enable **NoFall** in Meteor; the module will not turn it off.

## Main settings

| Setting | Default | Description |
| --- | --- | --- |
| `Mode` | Lunge | Lunge uses velocity; Blink delays movement packets. |
| `Max Targeting Range` | 256 | Maximum acquisition range. |
| `Target List Mode` | Blacklist | Whitelist or blacklist the selected entity types. |
| `Target Entities` | empty | Entity types to include/exclude. |
| `Ignore Friends` | on | Never target Meteor friends. |
| `Lunge Direction` | DirectionBased | DirectionBased, FromAbove, or Auto_FromAboveFirst. |
| `SpearVelocity` | 5.0 | Velocity applied toward the target. |
| `Stop on target` | on | Original SpearKill stop-at-target behavior. |
| `Stop Distance` | 2.0 | Hitbox distance at which the base module stops. |
| `Target Prediction` | 1.0 | Lead moving targets; 0 = no lead, 1 = estimated travel time, 2 = double. |
| `Lunge Delay Modifier` | 100% | How long to wait for the spear charge. |

Blink settings are preserved from the original module.

## Build

```bash
./gradlew build
```

The jar is `build/libs/spear-lunge-1.0.0.jar`.

## NoFall

The module does not import, toggle, or otherwise modify Meteor NoFall. Enable NoFall normally and the lunge will leave it alone.

## Credits

Original SpearKill: **etianl**  
Blink mode: **Kimtaeho**  
Original project: [Trouser-Streak](https://github.com/etianl/Trouser-Streak)

## Warning

This is a blatant combat/movement addon. Only use it where cheating is allowed.
