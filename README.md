# Spear Lunge

A Meteor Client addon for Minecraft **26.3**, based on Trouser-Streak's `SpearKill`.

The base Lunge/Blink module plus:

- **Optional target prediction.** `Target Prediction` controls how far ahead to aim; set it to `0` to aim directly at the target. It tracks observed target position changes.
- **Re-engage.** If a pass reaches the target and it is still alive, or if you start too close to the target, the module backs off to `Retreat Distance`, waits `Re-engage Delay`, and lunges again. It stops retreating after 40 ticks if something blocks it.
- **NoFall is never touched.** There is no NoFall setting, import, or toggle. Use Meteor NoFall normally.

## Usage

1. Put the jar in your `mods` folder next to Meteor Client.
2. Enable **Spear Lunge** in **Combat**.
3. Hold a spear, look at the target, and hold right click.

`Re-engage` is on by default. Turning it off restores the original `Stop on target` behavior. Setting `Target Prediction` to `0` aims directly at the target.

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
| `Stop on target` | on | Original SpearKill stop-at-target behavior (when Re-engage is off). |
| `Stop Distance` | 2.0 | Hitbox distance used by the original stop and by the close-range re-engage trigger. |
| `Re-engage` | on | Back off and lunge again if the target survives a pass or you start too close. |
| `Retreat Distance` | 8.0 | Distance to back away to before re-engaging. |
| `Retreat Speed` | 5.0 | Speed used while backing away. |
| `Re-engage Delay` | 10 | Ticks to wait after backing off before lunging again. |
| `Target Prediction` | 1.0 | Lead amount: 0 = no lead, 1 = estimated travel time, 2 = double. |
| `Lunge Delay Modifier` | 100% | How long to wait for the spear charge. |

Blink settings are preserved from the original module.

## Build

```bash
./gradlew build --refresh-dependencies
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
