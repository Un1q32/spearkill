# Spear Lunge

A Meteor Client addon for Minecraft **26.3**, based on Trouser-Streak's `SpearKill`.

The base Lunge/Blink module plus:

- **Optional target prediction.** `Target Prediction` controls how far ahead to aim; set it to `0` to aim directly at the target. It uses an intercept-time lead based on the target's observed velocity and closing speed.
- **Automatic elytra handling.** Fall-flying players are chased directly (`DirectionBased`) and the lateral prediction lead is capped at 1 block, so a juke cannot pull the stab ray off them. Other targets keep your configured `Lunge Direction` and normal prediction. Turn off `Elytra Handling` to use the old behavior for every target.
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
| `Ignore Friends` | off | Never target Meteor friends. |
| `Lunge Direction` | FromAbove | DirectionBased, FromAbove, or Auto_FromAboveFirst. |
| `Above Height` | 10.0 | Height above the target used by FromAbove. |
| `Above Height Trigger Distance` | 3.0 | Distance to the above point before diving at the target. |
| `SpearVelocity` | 5.0 | Velocity applied toward the target. |
| `Stop on target` | on | Original SpearKill stop-at-target behavior (when Re-engage is off). |
| `Stop Distance` | 2.0 | Hitbox distance used by the original stop and by the close-range re-engage trigger. |
| `Re-engage` | on | Back off and lunge again if the target survives a pass or you start too close. |
| `Retreat Distance` | 8.0 | Distance to back away to before re-engaging. |
| `Retreat Speed` | 10.0 | Speed used while backing away. |
| `Re-engage Delay` | 0 | Ticks to wait after backing off before lunging again. |
| `Target Prediction` | 1.0 | Intercept lead: 0 = no lead, 1 = estimated intercept, 2 = double. |
| `Elytra Handling` | on | Fall-flying players use `DirectionBased` and a 1-block lateral lead; other targets keep `Lunge Direction` and normal prediction. |
| `Lunge Delay Modifier` | 100% | How long to wait for the spear charge. |

When `Elytra Handling` is on, a fall-flying player is always chased with `DirectionBased`; your `Lunge Direction` and `Target Prediction` still apply normally to every other target.

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
