/**
 * generated by Xtext 2.10.0
 */
package it.unibo;

import it.unibo.FPMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FPMLStandaloneSetup extends FPMLStandaloneSetupGenerated {
  public static void doSetup() {
    FPMLStandaloneSetup _fPMLStandaloneSetup = new FPMLStandaloneSetup();
    _fPMLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
