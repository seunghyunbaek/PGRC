package best.hyun.pgrc.type.fourguardiangods

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class BlackTortoise : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_blacktortoise)
    override val type: PET_TYPE
        get() = PET_TYPE.FOURGUARDIANSOGDS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_blacktortoise)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 70
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 13
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1565
    override val maxLvMaxAtk: Int
        get() = 368
    override val maxLvMaxDef: Int
        get() = 300
    override val maxLvMaxSpd: Int
        get() = 190
    override val initLvMinHp: Int
        get() = 56
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 10
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1354
    override val maxLvMinAtk: Int
        get() = 330
    override val maxLvMinDef: Int
        get() = 261
    override val maxLvMinSpd: Int
        get() = 159
    override val minAllGrowth: Double
        get() = 5.211
    override val maxAllGrowth: Double
        get() = 5.918
}