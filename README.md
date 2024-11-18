# ✨ XML to React Native Form Parser ✨

🚀 This project dynamically converts **XML data** into **React Native forms**! It transforms XML structures into corresponding React Native components such as `TextInput`, `Text`, and others to create a fully functional and interactive form. 🎉

---

## 🌟 Features 🌟

✅ **Dynamic XML Parsing**: Automatically extracts form elements from XML.  
✅ **Component Mapping**: Maps `rect` to `TextInput` and `text` to `Text`.  
✅ **Logical Grouping**: Groups inputs (e.g., `Customer Name`, `Forename`) for clarity.  
✅ **Customizable & Extendable**: Add your own custom form components easily.  
✅ **Mobile-Ready**: Fully compatible with Android and iOS devices. 📱

---

## ⚡ Getting Started ⚡

### 📋 Prerequisites

- ⚙️ **Node.js** installed on your system.  
- 🛠️ A fully set-up **React Native environment**.  

---

### 🛠️ Installation

1️⃣ **Clone the repository**:  
   ```bash
   git clone https://github.com/mihireshjoshi/XML_to_ReactNative.git
   ```

2️⃣ **Navigate to the project folder**:  
   ```bash
   cd XML_to_ReactNative
   ```

3️⃣ **Install dependencies**:  
   ```bash
   npm install
   ```

---

### 🎮 Running the Project

1️⃣ **Start the development server**:  
   ```bash
   npm start
   ```

2️⃣ **Run the app on your device or emulator**:  
   - For Android:  
     ```bash
     npx react-native run-android
     ```
   - For iOS:  
     ```bash
     npx react-native run-ios
     ```

---

## 🖼️ Example XML Structure 🖼️

The application parses **XML structures** like this:

```xml
<div>
  <div id="formSide1">
    <svg>
      <svg>
        <g class="formSideMain">
          <g>
            <rect x="67" y="90" width="19" height="23" />
            <rect x="86" y="90" width="19" height="23" />
          </g>
          <text x="68" y="141">Customer Name</text>
          <g>
            <rect x="67" y="150" width="19" height="23" />
            <rect x="86" y="150" width="19" height="23" />
          </g>
          <text x="68" y="141">Forename</text>
        </g>
      </svg>
    </svg>
  </div>
</div>
```

---

## 🎨 Implementation Details

🔹 **Dynamic Parsing**: XML is parsed to extract `rect` and `text` elements.  
🔹 **Mapping Components**:  
   - `rect` → 🖋️ `TextInput`  
   - `text` → 📝 `Text`  
🔹 **Grouping Logic**: Groups by proximity and structure in the XML to create a seamless form layout.

---

## 🚀 Future Enhancements

✨ Add support for more XML element types.  
✨ Improve UI/UX with better form styling and validation.  
✨ Integrate animations for smoother interactions.  
✨ Add drag-and-drop functionality for custom forms.

---

## 🤝 Contributions Welcome!

We 💖 open-source! Feel free to contribute to this project by submitting pull requests or suggesting new features.  

---

🎉 *Enjoy building dynamic React Native forms!* 🚀  
*Happy Coding!* 💻
