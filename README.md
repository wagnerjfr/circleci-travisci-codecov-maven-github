[![Build Status](https://travis-ci.org/wagnerjfr/circleci-travisci-codecov-maven-github.svg?branch=master)](https://travis-ci.org/wagnerjfr/circleci-travisci-codecov-maven-github)

[![CI](https://circleci.com/gh/wagnerjfr/circleci-travisci-codecov-maven-github.svg?style=shield)](https://circleci.com/gh/wagnerjfr/circleci-travisci-codecov-maven-github)

[![codecov](https://codecov.io/gh/wagnerjfr/circleci-travisci-codecov-maven-github/branch/master/graph/badge.svg?token=D3IQCDGQHS)](https://codecov.io/gh/wagnerjfr/circleci-travisci-codecov-maven-github)

# circleci-travisci-codecov-maven-github
This is a very simple Maven project that shows how to configure Continuous Integration (CI) using [Travis CI](https://travis-ci.org/) and [Circle CI](https://circleci.com/),
plus add code coverage using [CodeCov](https://codecov.io/) and [Jacoco](https://www.eclemma.org/jacoco/).

## Considerations
- The main purpose here is to show an example on how we can setup it in our GitHub public repository.

- For CI we can use either **Travis CI** or **Circle CI**. I have both just to show the two options.

- For private repositories, instead of ***travis-ci.org*** and we need to access [travis-ci.com](https://travis-ci.com/) which is a paid service.

- Circle CI has a FREE plan that can be used.

- For all (Travis CI, Circle Ci and CodeCov) we can `Sign Up` using our own **GitHub** account.

- The tests were developed using [JUnit](https://junit.org/junit5/) testing framework.

- If you want to know how to setup a private repository, let me know (:star2:) and I can create a repository explaining the steps.

## Hands on steps

### Get the sample repository

- **Fork** this repository.

### Circle CI

- Go to [Circle CI](https://circleci.com/vcs-authorize/), 

- "Log In with GitHub"

<image>

- "Projects" and "Set up repository"

<image>

- Since the repository already has the config file in `.circleci/config.yml` click in `Using Existing Config` button.

<image>

### Travis CI

- Go to [Travis CI](https://travis-ci.org/)

- Sign in with GitHub

<image>
 
- Add/Enable the repository.

<image>

- Click on the repository enabled, on the right, "More options" -> "Trigger build"

<image>

- Click on "Trigger custom build" button.

<image>

- The process will build the project, run the unit tests and use Jacoco to send the code coverage results to CodeCoc in the end.

<image>

<image> 

### CodeCov

- Go to [CodeCov](https://codecov.io/)

- Sign up with GitHub

<image>
 
- If the repository doesn't show up automatically, you need either to add or activate it.

<image>

<image>

### GitHub

- Go the `README.md` file change the badge paths to use your GitHub's username. Replace `wagnerjfr` to your username. There are 6 places to change:
```
[![Build Status](https://travis-ci.org/<your username here>/circleci-travisci-codecov-maven-github.svg?branch=master)](https://travis-ci.org/<your username here>/circleci-travisci-codecov-maven-github)

[![CI](https://circleci.com/gh/<your username here>/circleci-travisci-codecov-maven-github.svg?style=shield)](https://circleci.com/gh/<your username here>/circleci-travisci-codecov-maven-github)

[![codecov](https://codecov.io/gh/<your username here>/circleci-travisci-codecov-maven-github/branch/master/graph/badge.svg)](https://codecov.io/gh/<your username here>/circleci-travisci-codecov-maven-github)
``` 
- Commit and push your changes. This is supposed to trigger the CI in Travis CI and Circle CI.

- Check the CI logs and the code coverage