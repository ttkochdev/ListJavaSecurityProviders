package listjavasecurityproviders;

/**
 *
 * @author Tyler
 */
import java.security.Provider;
import java.security.Security;

public class ListJavaSecurityProviders {
  public static void main(String[] args) {
    System.out.println("Providers installed on your system:");
    Provider[] providerList = Security.getProviders();
    for (int i = 0; i < providerList.length; i++) {
      System.out.println("Provider name: " + providerList[i].getName());
      System.out.println("Provider version number: " + providerList[i].getVersion());
      System.out.println("Provider information:\n" + providerList[i].getInfo() + "\n");
    }
  }
}


/*

Providers installed on your system:
Provider name: SUN
Provider version number: 1.7
Provider information:
SUN (DSA key/parameter generation; DSA signing; SHA-1, MD5 digests; SecureRandom; X.509 certificates; JKS keystore; PKIX CertPathValidator; PKIX CertPathBuilder; LDAP, Collection CertStores, JavaPolicy Policy; JavaLoginConfig Configuration)

Provider name: SunRsaSign
Provider version number: 1.7
Provider information:
Sun RSA signature provider

Provider name: SunEC
Provider version number: 1.7
Provider information:
Sun Elliptic Curve provider (EC, ECDSA, ECDH)

Provider name: SunJSSE
Provider version number: 1.7
Provider information:
Sun JSSE provider(PKCS12, SunX509 key/trust factories, SSLv3, TLSv1)

Provider name: SunJCE
Provider version number: 1.7
Provider information:
SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)

Provider name: SunJGSS
Provider version number: 1.7
Provider information:
Sun (Kerberos v5, SPNEGO)

Provider name: SunSASL
Provider version number: 1.7
Provider information:
Sun SASL provider(implements client mechanisms for: DIGEST-MD5, GSSAPI, EXTERNAL, PLAIN, CRAM-MD5, NTLM; server mechanisms for: DIGEST-MD5, GSSAPI, CRAM-MD5, NTLM)

Provider name: XMLDSig
Provider version number: 1.0
Provider information:
XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory)

Provider name: SunPCSC
Provider version number: 1.7
Provider information:
Sun PC/SC provider

Provider name: Apple
Provider version number: 1.1
Provider information:
Apple Provider

 */