/**
 * TODO Comment me please!
 *
 * @author Christian Scheiblich (cscheiblich@gmail.com)
 * @date 17.08.2014 14:11:10 
 *
 * Symlet4.java
 */
package math.jwave.transforms.wavelets.symlets;

import math.jwave.transforms.wavelets.Wavelet;

/**
 * Symlet4 filter: near symmetric, orthogonal (orthonormal), biorthogonal.
 * 
 * @author Christian Scheiblich (cscheiblich@gmail.com)
 * @date 17.08.2014 14:11:10
 */
public class Symlet4 extends Wavelet {

  /**
   * Already orthonormal coefficients taken from Filip Wasilewski's webpage
   * http://wavelets.pybytes.com/wavelet/sym4/ Thanks!
   * 
   * @author Christian Scheiblich (cscheiblich@gmail.com)
   * @date 17.08.2014 14:11:10
   */
  public Symlet4( ) {

    _name = "Symlet 4"; // name of the wavelet

    _transformWavelength = 2; // minimal wavelength of input signal

    _motherWavelength = 8; // wavelength of mother wavelet

    _scalingDeCom = new double[ _motherWavelength ];
    _scalingDeCom[ 0 ] = -0.07576571478927333;
    _scalingDeCom[ 1 ] = -0.02963552764599851;
    _scalingDeCom[ 2 ] = 0.49761866763201545;
    _scalingDeCom[ 3 ] = 0.8037387518059161;
    _scalingDeCom[ 4 ] = 0.29785779560527736;
    _scalingDeCom[ 5 ] = -0.09921954357684722;
    _scalingDeCom[ 6 ] = -0.012603967262037833;
    _scalingDeCom[ 7 ] = 0.0322231006040427;

    _buildOrthonormalSpace( );

  } // Symlet4

} // Symlet4
