libraries{
    merge = true
    maven
    sonarqube
}

stages{
    continuous_integration{
        build
        static_code_analysis
    }
}
