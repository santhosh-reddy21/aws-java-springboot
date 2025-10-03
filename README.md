# aws-java-springboot
# Spring Boot AWS S3 Demo Application

This is a simple Spring Boot application demonstrating **file upload and download using AWS S3**.  
It includes a service layer for S3 operations and REST endpoints for testing with tools like Postman or Insomnia.

---

## Table of Contents
1. [Features](#features)
2. [Prerequisites](#prerequisites)
3. [Setup](#setup)
4. [Configuration](#configuration)
5. [API Endpoints](#api-endpoints)
6. [Testing](#testing)
7. [Project Structure](#project-structure)
8. [Notes](#notes)

---

## Features
- Upload files to AWS S3
- Download files from AWS S3
- Uses AWS SDK v2
- Configuration via `application.properties`
- Service layer for S3 operations

---

## Prerequisites
- Java 17+ (or compatible)
- Maven
- AWS Account with an S3 bucket
- AWS Access Key ID & Secret Key
- IDE (IntelliJ, VS Code, Eclipse, etc.)

---

## Setup

1. Clone the repository:

```bash
git clone https://github.com/<your-username>/<repo-name>.git
cd <repo-name>

