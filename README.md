# Password Generator - Strategy Pattern

Different accounts need different passwords: a phone needs a PIN, a bank
needs a strong password, Wi-Fi can use simple words. The task is the same , only the way is different. Each way is a strategy

## Structure

- `PasswordStrategy` - strategy interface with one method `generate()`
- `PinPassword` - 4 digits (`4470`)
- `SimplePassword` - 10 letters and digits (`0fu1UQYTCh`)
- `StrongPassword` - 12 symbols, always has a small letter, a capital
  letter, a digit and a special symbol (`jI8%!QM?QJ%l`)
- `WordPassword` - 3 random words (`aitu-rock-dog`)
- `Account` - context. Keeps a strategy, calls `generate()`, can change
  the strategy with `setStrategy()`
- `Phone`, `Game`, `Bank`, `Wifi` - accounts with their default strategy
- `RandomText` - helper for random symbols and words
- `Main` - client. Creates accounts and changes strategies at runtime

## Example output

```
Phone: 4470
Game:  0fu1UQYTCh
Bank:  jI8%!QM?QJ%l
Wifi:  aitu-rock-dog

Changing strategy at runtime:
Wifi:  wA1!fZ?E2yAk
Phone: aitu-rock-aitu
```

## Clean Code principles

1. **No if/switch** - `Account.createPassword()` just calls
   `strategy.generate()`. Polymorphism chooses the right algorithm.
2. **Meaningful names** - `PinPassword`, `createPassword()`,
   `oneOfEachType()`. Constants like `LENGTH` and `WORD_COUNT` instead of
   magic numbers, so the code is easy to read without comments.
3. **Single Responsibility** - each strategy has one algorithm, `Account`
   only works with the strategy, `RandomText` only makes random values.
   So if we change one algorithm, other classes do not change.
4. **Account knows only the interface** - it does not import any concrete
   strategy, so strategies can change without touching `Account`.
5. **Open/Closed** - a new password type is just a new class that
   implements `PasswordStrategy`. Old classes stay the same.
6. **Encapsulation** - fields are `private`, the strategy is passed through
   the constructor, so nobody can break it from outside and it is never `null`.
