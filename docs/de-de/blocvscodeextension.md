<p align="center">
<img src="https://raw.githubusercontent.com/felangel/bloc/master/docs/assets/bloc_logo_full.png" height="100" alt="Bloc" />
</p>

<p align="center">
<a href="https://github.com/felangel/bloc/actions"><img src="https://img.shields.io/github/workflow/status/felangel/bloc/build.svg?logo=github" alt="build"></a>
<a href="https://codecov.io/gh/felangel/bloc"><img src="https://codecov.io/gh/felangel/Bloc/branch/master/graph/badge.svg" alt="codecov"></a>
<a href="https://github.com/felangel/bloc"><img src="https://img.shields.io/github/stars/felangel/bloc.svg?style=flat&logo=github&colorB=deeppink&label=stars" alt="Star on Github"></a>
<a href="https://marketplace.visualstudio.com/items?itemName=FelixAngelov.bloc"><img src="https://vsmarketplacebadge.apphb.com/version-short/FelixAngelov.bloc.svg" alt="Version"></a>
<a href="https://marketplace.visualstudio.com/items?itemName=FelixAngelov.bloc"><img src="https://vsmarketplacebadge.apphb.com/installs-short/FelixAngelov.bloc.svg" alt="Installs"></a>
<a href="https://marketplace.visualstudio.com/items?itemName=FelixAngelov.bloc"><img src="https://vsmarketplacebadge.apphb.com/rating-short/FelixAngelov.bloc.svg" alt="Ratings"></a>
<a href="https://flutter.dev/docs/development/data-and-backend/state-mgmt/options#bloc--rx"><img src="https://img.shields.io/badge/flutter-website-deepskyblue.svg" alt="Flutter Website"></a>
<a href="https://github.com/Solido/awesome-flutter#standard"><img src="https://img.shields.io/badge/awesome-flutter-blue.svg?longCache=true" alt="Awesome Flutter"></a>
<a href="http://fluttersamples.com"><img src="https://img.shields.io/badge/flutter-samples-teal.svg?longCache=true" alt="Flutter Samples"></a>
<a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/license-MIT-purple.svg" alt="License: MIT"></a>
<a href="https://discord.gg/bloc"><img src="https://img.shields.io/discord/649708778631200778.svg?logo=discord&color=blue" alt="Discord"></a>
<a href="https://github.com/felangel/bloc"><img src="https://tinyurl.com/bloc-library" alt="Bloc Library"></a>
</p>

---

## ??bersicht

[VSCode](https://code.visualstudio.com/) unterst??tzt die [Bloc Library](https://bloclibrary.dev) und bietet Werkzeuge zur effektiven Erstellung von [Blocs](https://github.com/felangel/bloc) und [Cubits](https://github.com/felangel/cubit) sowohl f??r [Flutter](https://flutter.dev/) als auch f??r [AngularDart](https://angulardart.dev/) Anwendungen.

## Installation

Bloc kann ??ber den [VSCode-Marktplatz](https://marketplace.visualstudio.com/items?itemName=FelixAngelov.bloc) oder durch [Suche in VSCode](https://code.visualstudio.com/docs/editor/extension-gallery#_search-for-an-extension) installiert werden.

## Befehle

| Befehl             | Beschreibung               |
| ------------------ | -------------------------- |
| `Bloc: New Bloc`   | Einen neuen Bloc erzeugen  |
| `Cubit: New Cubit` | Einen neuen Cubit erzeugen |

Sie k??nnen die Befehle aktivieren, indem Sie die `command palette` aufrufen `(View -> Command Palette)` und den Befehlsnamen eingeben, oder Sie k??nnen mit der rechten Maustaste auf das Verzeichnis klicken, in dem Sie den Bloc/Cubit erstellen m??chten, und den Befehl aus dem Kontextmen?? ausw??hlen.

![demo](https://raw.githubusercontent.com/felangel/bloc/master/extensions/vscode/assets/new-bloc-usage.gif)

## Code-Aktionen

| Aktion                         | Beschreibung                                              |
| ------------------------------ | --------------------------------------------------------- |
| `Wrap with BlocBuilder`        | Umh??llt das aktuelle Widget in einen `BlocBuilder`        |
| `Wrap with BlocListener`       | Umh??llt das aktuelle Widget in einen `BlocListener`       |
| `Wrap with BlocConsumer`       | Umh??llt das aktuelle Widget in einen `BlocConsumer`       |
| `Wrap with BlocProvider`       | Umh??llt das aktuelle Widget in einen `BlocProvider`       |
| `Wrap with RepositoryProvider` | Umh??llt das aktuelle Widget in einen `RepositoryProvider` |

![demo](https://raw.githubusercontent.com/felangel/bloc/master/extensions/vscode/assets/wrap-with-usage.gif)

## Schnipsel

### Bloc

| Abk??rzung           | Beschreibung                                  |
| ------------------- | --------------------------------------------- |
| `bloc`              | Erzeugt eine `Bloc` Klasse                    |
| `cubit`             | Erzeugt eine `Cubit` Klasse                   |
| `blocobserver`      | Erzeugt eine `BlocObserver` Klasse            |
| `blocprovider`      | Erzeugt eine `BlocProvider` widget            |
| `multiblocprovider` | Erzeugt eine `MultiBlocProvider` widget       |
| `repoprovider`      | Erzeugt eine `RepositoryProvider` widget      |
| `multirepoprovider` | Erzeugt eine `MultiRepositoryProvider` widget |
| `blocbuilder`       | Erzeugt eine `BlocBuilder` widget             |
| `bloclistener`      | Erzeugt eine `BlocListener` widget            |
| `multibloclistener` | Erzeugt eine `MultiBlocListener` widget       |
| `blocconsumer`      | Erzeugt eine `BlocConsumer` widget            |
| `blocof`            | Abk??rzung f??r `BlocProvider.of()`             |
| `repoof`            | Abk??rzung f??r `RepositoryProvider.of()`       |
| `read`              | Abk??rzung f??r `context.read()`                |
| `watch`             | Abk??rzung f??r `context.watch()`               |
| `select`            | Abk??rzung f??r `context.select()`              |
| `blocstate`         | Erzeugt eine Zustandsklasse (state class)     |
| `blocevent`         | Erzeugt eine Ereignisklasse (event class)     |

### Freezed Bloc

| Shortcut     | Description                                                                      |
| ------------ | -------------------------------------------------------------------------------- |
| `feventwhen` | Erstellt ein Map-Ereignis f??r eine Zustandsfunktion mit der Funktion freeze.when |
| `feventmap`  | Erstellt mit der Funktion freeze.map eine map event to state Funktion            |
| `fstate`     | Erzeugt einen Unterzustand                                                       |
| `fevent`     | Erzeugt ein Unterereignis                                                        |
