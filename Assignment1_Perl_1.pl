use strict;
use warnings;
use Encode;

my $filename = 'Aslahuddin.txt';

open(my $fh, '>', $filename) or die "Could not open file '$filename' $!";

print "Please Input Your Name : ";
my $name = <STDIN>;
print "Please Input Your Address : ";
my $address = <STDIN>;
print $fh "Your name : $name";
print $fh "Address : $address";
close $fh;


