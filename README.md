
# ✨ XML to React Native Form Generator ✨

🚀 **Dynamically convert XML input into fully interactive React Native forms!**  
This project takes an XML structure, parses it, and creates forms on the fly with support for various input types like text fields, radio buttons, date pickers, and signature fields. It is mobile-friendly and customizable to meet all your form-generation needs! 🎉

---

## 🌟 Features 🌟

- **📄 Dynamic XML Parsing**: Converts structured XML into JSON for seamless integration.
- **🔗 Component Mapping**: Maps XML elements like `<rect>` to `TextInput` and `<text>` to labels.
- **🎨 Interactive Forms**: Supports advanced input fields, including:
  - Text Inputs
  - Date Fields
  - Radio Buttons
  - Signature Fields
- **📱 Mobile Ready**: Works perfectly on both iOS and Android.
- **🔧 Customizable**: Easily extendable for new XML formats or input types.

---

## 📋 Prerequisites

1. Install **Node.js** on your system.
2. Set up the **React Native environment** (with Expo for simplicity).
3. Install **Expo CLI** globally:
   ```bash
   npm install -g expo-cli
   ```

---

## 🛠️ Installation Steps

1. Clone the repository:
   ```bash
   https://github.com/sohamk63/Alemeno_task.git
   ```

2. Navigate to the project folder:
   ```bash
   cd XMLFormGenerator
   ```

3. Install dependencies:
   ```bash
   npm install
   ```

4. Start the development server:
   ```bash
   expo start
   ```

---

## 🎮 Running the Application

For Android:
```bash
npx expo run:android
```

For iOS:
```bash
npx expo run:ios
```

In the Browser: Use the Expo development environment or scan the QR code.

---

## 🖼️ XML Input Structure

The application accepts XML input in the following format:

```xml
<div>
  <g id="textGroup1" fdtType="iso" fdtFieldName="Customer Name">
    <rect x="50" y="50" width="20" height="30" />
    <rect x="70" y="50" width="20" height="30" />
  </g>
  <g id="radioGroup1" fdtType="radioList" fdtFieldName="Options">
    <rect id="option1" x="50" y="100" width="20" height="20" />
    <text id="label1" x="80" y="110">Option 1</text>
    <rect id="option2" x="50" y="130" width="20" height="20" />
    <text id="label2" x="80" y="140">Option 2</text>
  </g>
  <g id="signatureField" fdtType="cursiveSignature" fdtFieldName="Signature" />
</div>
```

---

## 📖 Supported Input Types

1. **Text Fields (`iso`)**: Single-character inputs.
2. **Date Fields (`date`)**: Date selectors with separators (`/`).
3. **Radio Buttons (`radioList`)**: Interactive selection options.
4. **Signature Fields (`cursiveSignature`)**: Drawable canvas for signatures.

---

## ✍️ Usage

### Home Page
1. **Option 1**: Select an XML file using the "Click to Select Document" button.  
2. **Option 2**: Paste XML content directly into the **Input XML Directly** section.  

Once the XML is provided, click **"Create XML Form"** to generate the form.

### Generated Forms
- Interactive forms are rendered dynamically based on the XML structure.
- Fields include text boxes, radio buttons, date inputs, and more.

---

## 🔎 Implementation Details

### Approach

1. **XML Parsing**:  
   - The app uses the `react-native-xml2js` library to convert XML into a JSON-like format.
   - Nodes are extracted using attributes like `fdtType` and `fdtFieldName`.

2. **Form Rendering**:  
   - Mapped XML attributes (`rect`, `text`, etc.) to React Native components (`TextInput`, `TouchableOpacity`, `View`).
   - Grouped components dynamically based on proximity or IDs.

3. **Interactivity**:  
   - Auto-focus for text fields.
   - Selection behavior for radio buttons.
   - Drawing and clearing capabilities for signature fields.

---

### Libraries Used

- **`expo-document-picker`**: For file selection.
- **`react-native-xml2js`**: For parsing XML to JSON.
- **`react-native-signature-canvas`**: For the signature field canvas.

---

## 📸 Screenshots

# Screenshots

## 1. Home Page
A clean interface allowing users to either upload XML files or input XML content directly.

<div style="display: flex; align-items: center; gap: 20px;">
  <img src="Home Page.jpg" alt="Home Page" width="300">
</div>

---

## 2. Generated Form
Dynamic forms rendered based on the XML input, showcasing text inputs, radio buttons, and more.

<div style="display: flex; flex-direction: column; align-items: center; gap: 100px;">
  <img src="Provided form.jpeg" alt="Generated Form" width="300">
  <img src="Custom form.jpeg" alt="Custom Form" width="300">
</div>

## 📝 Sample XML Inputs

Below are some complex XML structures to test the functionality of the application:

---

### **Form 1: Employee Details and Preferences**

```xml
<div>
  <g id="textGroup1" fdtType="iso" fdtFieldName="Employee Name">
    <rect x="50" y="50" width="20" height="30" />
    <rect x="70" y="50" width="20" height="30" />
    <rect x="90" y="50" width="20" height="30" />
    <rect x="110" y="50" width="20" height="30" />
    <rect x="130" y="50" width="20" height="30" />
    <rect x="150" y="50" width="20" height="30" />
    <rect x="170" y="50" width="20" height="30" />
    <rect x="190" y="50" width="20" height="30" />
    <rect x="210" y="50" width="20" height="30" />
    <rect x="230" y="50" width="20" height="30" />
  </g>

  <g id="dateGroup1" fdtType="date" fdtFieldName="Date of Joining">
    <rect x="50" y="100" width="20" height="30" />
    <rect x="70" y="100" width="20" height="30" />
    <rect x="110" y="100" width="20" height="30" />
    <rect x="130" y="100" width="20" height="30" />
    <rect x="170" y="100" width="20" height="30" />
    <rect x="190" y="100" width="20" height="30" />
    <rect x="210" y="100" width="20" height="30" />
    <rect x="230" y="100" width="20" height="30" />
  </g>

  <g id="radioGroup1" fdtType="radioList" fdtFieldName="Preferred Department">
    <rect id="option1" x="50" y="150" width="20" height="20" />
    <text id="label1" x="80" y="160">HR</text>
    <rect id="option2" x="50" y="180" width="20" height="20" />
    <text id="label2" x="80" y="190">Finance</text>
    <rect id="option3" x="50" y="210" width="20" height="20" />
    <text id="label3" x="80" y="220">Engineering</text>
    <rect id="option4" x="50" y="240" width="20" height="20" />
    <text id="label4" x="80" y="250">Marketing</text>
  </g>

  <g id="signatureField1" fdtType="cursiveSignature" fdtFieldName="Employee Signature"></g>
</div>
```


```
<div>

  <g id="textGroup1" fdtType="iso" fdtFieldName="Full Name">
    <rect x="50" y="50" width="20" height="30" />
    <rect x="70" y="50" width="20" height="30" />
    <rect x="90" y="50" width="20" height="30" />
    <rect x="110" y="50" width="20" height="30" />
    <rect x="130" y="50" width="20" height="30" />
    <rect x="150" y="50" width="20" height="30" />
    <rect x="170" y="50" width="20" height="30" />
    <rect x="190" y="50" width="20" height="30" />
    <rect x="210" y="50" width="20" height="30" />
    <rect x="230" y="50" width="20" height="30" />
  </g>

  <g id="dateGroup1" fdtType="date" fdtFieldName="Date of Birth">
    <rect x="50" y="100" width="20" height="30" />
    <rect x="70" y="100" width="20" height="30" />
    <rect x="110" y="100" width="20" height="30" />
    <rect x="130" y="100" width="20" height="30" />
    <rect x="170" y="100" width="20" height="30" />
    <rect x="190" y="100" width="20" height="30" />
    <rect x="210" y="100" width="20" height="30" />
    <rect x="230" y="100" width="20" height="30" />
  </g>


  <g id="radioGroup1" fdtType="radioList" fdtFieldName="Satisfaction Level">
    <rect id="option1" x="50" y="150" width="20" height="20" />
    <text id="label1" x="80" y="160">Very Satisfied</text>
    <rect id="option2" x="50" y="180" width="20" height="20" />
    <text id="label2" x="80" y="190">Satisfied</text>
    <rect id="option3" x="50" y="210" width="20" height="20" />
    <text id="label3" x="80" y="220">Neutral</text>
    <rect id="option4" x="50" y="240" width="20" height="20" />
    <text id="label4" x="80" y="250">Dissatisfied</text>
    <rect id="option5" x="50" y="270" width="20" height="20" />
    <text id="label5" x="80" y="280">Very Dissatisfied</text>
  </g>


  <g id="textGroup2" fdtType="iso" fdtFieldName="Email">
    <rect x="50" y="320" width="20" height="30" />
    <rect x="70" y="320" width="20" height="30" />
    <rect x="90" y="320" width="20" height="30" />
    <rect x="110" y="320" width="20" height="30" />
    <rect x="130" y="320" width="20" height="30" />
    <rect x="150" y="320" width="20" height="30" />
    <rect x="170" y="320" width="20" height="30" />
    <rect x="190" y="320" width="20" height="30" />
    <rect x="210" y="320" width="20" height="30" />
    <rect x="230" y="320" width="20" height="30" />
  </g>

  <g id="signatureField1" fdtType="cursiveSignature" fdtFieldName="Survey Taker Signature"></g>
</div>
```


## 🎥 Demo Video

Watch the full demonstration of the app functionality: 
(https://drive.google.com/file/d/19MDlJolYunBCdlIF_-tb6nGHd9ZVn9xx/view?usp=drive_link)



---

## 🚀 Future Enhancements

1. Add support for dropdown menus and other advanced input types.
2. Improve the UI/UX design with animations.
3. Add validation features for required fields.
