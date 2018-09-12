
# react-native-cielo

## Getting started

`$ npm install react-native-cielo --save`

### Mostly automatic installation

`$ react-native link react-native-cielo`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-cielo` and add `RNCielo.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNCielo.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.RNCieloPackage;` to the imports at the top of the file
  - Add `new RNCieloPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-cielo'
  	project(':react-native-cielo').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-cielo/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-cielo')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNCielo.sln` in `node_modules/react-native-cielo/windows/RNCielo.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Cielo.RNCielo;` to the usings at the top of the file
  - Add `new RNCieloPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNCielo from 'react-native-cielo';

// TODO: What to do with the module?
RNCielo;
```
  