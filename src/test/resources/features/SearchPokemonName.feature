@Web
  Feature: Search Pokemon Name on Wikipedia page

    @Pikachu
    Scenario: Search pokemon named Pikachu on Wikipedia page
      Given User open google homepage
      When User input search "Pikachu" on google homepage
      Then User see article with title "Pikachu" on article page

    @Charizard
    Scenario: Search pokemon named Charizard on Wikipedia page
      Given User open google homepage
      When User input search "Charizard" on google homepage
      Then User see article with title "Charizard" on article page

    @Bulbasaur
    Scenario: Search pokemon named Bulbasaur on Wikipedia page
      Given User open google homepage
      When User input search "Bulbasaur" on google homepage
      Then User see article with title "Bulbasaur" on article page

    @Mewtwo
    Scenario: Search pokemon named Mewtwo on Wikipedia page
      Given User open google homepage
      When User input search "Mewtwo" on google homepage
      Then User see article with title "Mewtwo" on article page