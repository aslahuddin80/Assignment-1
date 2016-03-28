use strict;
use warnings;
use Encode;

my $filename = "Aslahuddin.txt";
my $binfile = "Aslahuddin.bin";

open(my $fht, '<', $filename) or die "Could not open file '$filename' $!";
open(my $bfm, '>', $binfile) or die "Unable to open: $!";
my $val;
while (my $row = <$fht>){
	chomp $row; 
	$val = unpack('B*',$row);
	print $bfm "$val\n";
}
close $fht;
close $bfm;