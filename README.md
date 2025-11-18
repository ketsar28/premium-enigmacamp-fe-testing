# Premium Enigmacamp Frontend - Automated Testing

![Katalon Studio](https://img.shields.io/badge/Katalon%20Studio-10.0.0-43B02A?style=for-the-badge&logo=katalon&logoColor=white)
![Testing](https://img.shields.io/badge/Testing-Automation-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)

## 📋 Overview

This repository contains comprehensive automated test suites for the **Premium Enigmacamp** frontend application. Built with Katalon Studio, this project ensures quality assurance through systematic E2E testing of critical user workflows including shopping cart operations, user profile management, and security features.

## 🎯 Project Scope

The testing framework covers the following key areas:

### 🛒 Shopping Cart Testing
- Add single and multiple packages to cart
- Product selection and customization
- Cart persistence across sessions
- Package dropdown interactions
- Payment gateway integration (Snap Midtrans)
- Cart operations (delete, update, refresh)

### 👤 Profile Management Testing
- **General Information**
  - User profile data validation
  - Profile update functionality
  - Data persistence verification

- **Security Features**
  - Authentication flows
  - Password management
  - Session handling
  - Logout/Login persistence

## 🏗️ Project Structure

```
premium-enigmacamp-fe-testing/
├── Include/
│   └── scripts/groovy/          # Custom Groovy scripts
├── Object Repository/           # Web element definitions
├── Profiles/                    # Test execution profiles
├── Scripts/                     # Test scripts
├── Test Cases/
│   ├── Shopping Cart/          # Shopping cart test cases
│   ├── Profile - General Info/ # Profile information tests
│   └── Profile - Security/     # Security-related tests
├── Test Suites/
│   ├── Shopping Cart/          # Shopping cart test suite
│   ├── Profile - General Info/ # Profile info test suite
│   ├── Profile - Security/     # Security test suite
│   └── TSC-Profile Test Suite and Shopping Cart.ts
└── settings/                    # Project configurations
```

## 🚀 Getting Started

### Prerequisites

- **Katalon Studio** (v9.7.1 or higher)
- **Java Development Kit (JDK)** 8 or above
- **Web Browser** (Chrome, Firefox, or Edge)
- Active internet connection

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/ketsar28/premium-enigmacamp-fe-testing.git
   ```

2. Open Katalon Studio

3. Navigate to **File** → **Open Project**

4. Select the `Premium Enigmacamp FE.prj` file

### Running Tests

#### Via Katalon Studio GUI
1. Open the project in Katalon Studio
2. Navigate to **Test Suites** folder
3. Right-click on desired test suite
4. Select **Run** → **Browser of choice**

#### Via Command Line
```bash
katalon -noSplash -runMode=console -projectPath="path/to/Premium Enigmacamp FE.prj" -retry=0 -testSuitePath="Test Suites/TSC-Profile Test Suite and Shopping Cart" -browserType="Chrome"
```

## 📊 Test Coverage

| Module | Test Cases | Status |
|--------|-----------|--------|
| Shopping Cart | 17+ | ✅ Active |
| Profile - General Info | Multiple | ✅ Active |
| Profile - Security | Multiple | ✅ Active |

## 🛠️ Technologies & Tools

- **Katalon Studio** - Test automation platform
- **Groovy** - Scripting language
- **Gradle** - Build automation
- **Selenium WebDriver** - Browser automation
- **Git** - Version control

## 📝 Test Case Naming Convention

Test cases follow the format: `TS-XXX_Description`

**Examples:**
- `TS-001_Verify User Can Add Single Package to Shopping Cart`
- `TS-012_Verify User Can Click Customize Package Dropdown Twice for Selected Package`
- `TS-015_Verify User is Redirected to Snap Midtrans Payment Page After Product Selection`

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

## 📫 Connect With Me

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-ketsar28-181717?style=for-the-badge&logo=github)](https://github.com/ketsar28/)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-ketsarali-0A66C2?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/ketsarali/)
[![Instagram](https://img.shields.io/badge/Instagram-ketsar.aaw-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/ketsar.aaw/)
[![HuggingFace](https://img.shields.io/badge/HuggingFace-ketsar-FFD21E?style=for-the-badge&logo=huggingface&logoColor=black)](https://huggingface.co/ketsar)
[![Streamlit](https://img.shields.io/badge/Streamlit-ketsar28-FF4B4B?style=for-the-badge&logo=streamlit&logoColor=white)](https://share.streamlit.io/user/ketsar28)
[![WhatsApp](https://img.shields.io/badge/WhatsApp-Contact%20Me-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://api.whatsapp.com/send/?phone=6285155343380&text=[pre-filled])

</div>

## 📄 License & Copyright

Copyright © 2024 **Ketsar Ali**. All rights reserved.

This project and its contents are proprietary and confidential. Unauthorized copying, distribution, or use of this software, via any medium, is strictly prohibited without explicit permission from the copyright holder.

---

<div align="center">

**Made with ❤️ by [Ketsar Ali](https://github.com/ketsar28/)**

⭐ Star this repository if you find it helpful!

</div>
